package com.himedia.twoving.dao;

import java.util.ArrayList;

import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.NoticeVO;

public class NoticeDAO {
	private NoticeDAO() {
		
	}
	
	private static NoticeDAO itc = new NoticeDAO();
	
	public static NoticeDAO getInstance() {
		return itc;
	}

	public int getAllCount() {
		int count = 0;
		
		return count;
	}

	public ArrayList<NoticeVO> adminProductList(Paging paging) {
		ArrayList<NoticeVO> list = new ArrayList<NoticeVO>();
		
		return list;
	}
}
