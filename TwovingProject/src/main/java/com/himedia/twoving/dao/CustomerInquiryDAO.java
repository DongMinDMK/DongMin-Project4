package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.vo.CustomerInquiryVO;

public class CustomerInquiryDAO {
	private CustomerInquiryDAO() {
		
	}
	
	private static CustomerInquiryDAO itc = new CustomerInquiryDAO();
	
	public static CustomerInquiryDAO getInstance() {
		return itc;
	}

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void insertCustomerInquiry(CustomerInquiryVO civo) {
		con = DBman.getConnection();
		
		String sql = "insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runenvironment, runplace, runtime1, runtime2, runcontent, inquirytitle, inquirycontent, reply)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, civo.getName());
			pstmt.setString(2, civo.getEmail());
			pstmt.setString(3, civo.getPhone());
			pstmt.setString(4, civo.getInquiryList());
			pstmt.setString(5, civo.getDevicephone());
			pstmt.setString(6, civo.getDevicemodelname());
			pstmt.setString(7, civo.getRunenvironment());
			pstmt.setString(8, civo.getRunplace());
			pstmt.setString(9, civo.getRuntime1());
			pstmt.setString(10, civo.getRuntime2());
			pstmt.setString(11, civo.getRuncontent());
			pstmt.setString(12, civo.getInquirytitle());
			pstmt.setString(13, civo.getInquirycontent());
			pstmt.setString(14, civo.getReply());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
	}
	
}
