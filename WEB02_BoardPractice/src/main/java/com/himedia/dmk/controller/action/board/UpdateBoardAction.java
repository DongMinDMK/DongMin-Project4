package com.himedia.dmk.controller.action.board;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

public class UpdateBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setNum(num);
		boardDTO.setPass(request.getParameter("pass"));
		boardDTO.setUserid(request.getParameter("userid"));
		boardDTO.setEmail(request.getParameter("email"));
		boardDTO.setTitle(request.getParameter("title"));
		boardDTO.setContent(request.getParameter("content"));
		
		// 저장경로 설정
		HttpSession session = request.getSession();
		ServletContext context = session.getServletContext();
		String uploadFilePath = context.getRealPath("images");
		
		// 저장경로 파일폴더 생성
		File uploadDir = new File(uploadFilePath);
		if(!uploadDir.exists()) uploadDir.mkdir();
		
		String fileName = "";
		String saveFilename = "";
		
		// 전송된 파라미터 들 중 헤더이름이 filename 이라는 이름을 가진 헤더를 찾고 그 헤더의 이름을 추출
		for(Part part : request.getParts()) {
			fileName = "";
			System.out.println(part.getHeader("content-disposition"));
			
			for(String content : part.getHeader("content-disposition").split(";")) {
				if(content.trim().startsWith("filename")) {
					fileName = content.substring(content.indexOf("=")+2, content.length()-1);
					System.out.println("fileName : " + fileName);
					
					
					if(!fileName.equals("")) {
						Calendar today = Calendar.getInstance();
						long dt = today.getTimeInMillis();
						
						String fn1 = fileName.substring(0, fileName.indexOf("."));
						String fn2 = fileName.substring(fileName.indexOf("."));
						
						saveFilename = fn1 + dt + fn2;
						
						part.write(uploadFilePath + File.separator + saveFilename); // 파일저장
						
						System.out.println("파일명 : " + fileName + " 저장완료!!!");
						
						boardDTO.setImage(fileName);
						boardDTO.setSavefilename(saveFilename);
					}else {
						boardDTO.setImage(request.getParameter("oldimage"));
						boardDTO.setSavefilename(request.getParameter("oldsavefilename"));
					}
				}
			}
		
		}
		
		
		boardDAO.updateBoard(boardDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("board.do?command=boardViewWithoutCnt&num=" + boardDTO.getNum());
		rd.forward(request, response);
		
	}

}
