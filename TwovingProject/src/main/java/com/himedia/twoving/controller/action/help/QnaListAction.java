package com.himedia.twoving.controller.action.help;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.CustomerInquiryDAO;
import com.himedia.twoving.vo.CustomerInquiryVO;
import com.himedia.twoving.vo.MemberVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class QnaListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO)session.getAttribute("loginUser");
		
		if(memberVO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("member/loginForm.jsp");
			rd.forward(request, response);
		}else {
			String name = request.getParameter("name");
			
			String emailid = request.getParameter("emailid");
			String emailid2 = request.getParameter("emailid2");
			
			String email = emailid + "@" + emailid2;
			
			String phone = request.getParameter("phone");
			String phone1 = request.getParameter("phone1");
			String phone2 = request.getParameter("phone2");
			
			String phoneNum = phone + "-" + phone1 + "-" + phone2;
			
			String inquiry = request.getParameter("radio1");
			
			String devicephone = request.getParameter("devicephone");
			String devicemodelname = request.getParameter("devicemodelname");
			
			String runtime1 = request.getParameter("time1");
			String runtime2 = request.getParameter("time2");
			
			String runenvironment = request.getParameter("runenvironment");
			
			String runplace = request.getParameter("runplace");
			
			String runcontent = request.getParameter("runcontent");
			
			String inquirytitle = request.getParameter("inquirytitle");
			
			System.out.println("inquirytitle : " + inquirytitle);
			
			String inquirycontent = request.getParameter("inquirycontent");
			
			CustomerInquiryVO civo = new CustomerInquiryVO();
			civo.setName(name);
			civo.setEmail(email);
			civo.setPhone(phoneNum);
			civo.setInquiryList(inquiry);
			civo.setDevicephone(devicephone);
			civo.setDevicemodelname(devicemodelname);
			civo.setRunenvironment(runenvironment);
			civo.setRunplace(runplace);
			civo.setRuntime1(runtime1);
			civo.setRuntime2(runtime2);
			civo.setRuncontent(runcontent);
			civo.setInquirytitle(inquirytitle);
			civo.setInquirycontent(inquirycontent);
			
			CustomerInquiryDAO cidao = CustomerInquiryDAO.getInstance();
			cidao.insertCustomerInquiry(civo);
			
			RequestDispatcher rd = request.getRequestDispatcher("noticeAlert.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
