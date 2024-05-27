package com.himedia.twoving.dao;

public class CustomerInquiryDAO {
	private CustomerInquiryDAO() {
		
	}
	
	private static CustomerInquiryDAO itc = new CustomerInquiryDAO();
	
	public static CustomerInquiryDAO getInstance() {
		return itc;
	}
	
}
