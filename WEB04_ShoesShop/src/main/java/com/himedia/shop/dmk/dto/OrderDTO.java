package com.himedia.shop.dmk.dto;

import java.sql.Timestamp;

public class OrderDTO {
	private Integer odseq;
	private Integer oseq;
	private Timestamp indate;
	private String userid;
	private String mname;
	private String zip_num;
	private String address1;
	private String address2;
	private String phone;
	private Integer pseq;
	private String pname;
	private Integer price2;
	private Integer quantity;
	private String result;
	public Integer getOdseq() {
		return odseq;
	}
	public void setOdseq(Integer odseq) {
		this.odseq = odseq;
	}
	public Integer getOseq() {
		return oseq;
	}
	public void setOseq(Integer oseq) {
		this.oseq = oseq;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getZip_num() {
		return zip_num;
	}
	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPseq() {
		return pseq;
	}
	public void setPseq(Integer pseq) {
		this.pseq = pseq;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPrice2() {
		return price2;
	}
	public void setPrice2(Integer price2) {
		this.price2 = price2;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
