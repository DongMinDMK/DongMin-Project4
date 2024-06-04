package com.himedia.twoving.vo;

import java.sql.Timestamp;

public class CustomerInquiryVO {
	
	private int ciseq;
	private String name;
	private String email;
	private String phone;
	private String inquiryList; //문의종류
	private String devicephone; // 디바이스폰
	private String devicemodelname; //디바이스모델명
	private String runenvironment; //이용환경
	private String runplace; // 이용장소
	private String runtime1; //이용시간(문의할 때 사용한 이용시간)
	private String runtime2; //이용시간(문의할 때 사용한 이용시간)
	private String runcontent; //이용콘텐츠
	private String inquirytitle; //문의제목
	private String inquirycontent; //문의내용
	private String reply;
	private Timestamp indate;
	
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getRunenvironment() {
		return runenvironment;
	}
	public void setRunenvironment(String runenvironment) {
		this.runenvironment = runenvironment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRunplace() {
		return runplace;
	}
	public void setRunplace(String runplace) {
		this.runplace = runplace;
	}
	public String getDevicephone() {
		return devicephone;
	}
	public void setDevicephone(String devicephone) {
		this.devicephone = devicephone;
	}
	public String getDevicemodelname() {
		return devicemodelname;
	}
	public void setDevicemodelname(String devicemodelname) {
		this.devicemodelname = devicemodelname;
	}
	public String getRuntime1() {
		return runtime1;
	}
	public void setRuntime1(String runtime1) {
		this.runtime1 = runtime1;
	}
	public String getRuntime2() {
		return runtime2;
	}
	public void setRuntime2(String runtime2) {
		this.runtime2 = runtime2;
	}
	public int getCiseq() {
		return ciseq;
	}
	public void setCiseq(int ciseq) {
		this.ciseq = ciseq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInquiryList() {
		return inquiryList;
	}
	public void setInquiryList(String inquiryList) {
		this.inquiryList = inquiryList;
	}
	public String getRuncontent() {
		return runcontent;
	}
	public void setRuncontent(String runcontent) {
		this.runcontent = runcontent;
	}
	public String getInquirytitle() {
		return inquirytitle;
	}
	public void setInquirytitle(String inquirytitle) {
		this.inquirytitle = inquirytitle;
	}
	public String getInquirycontent() {
		return inquirycontent;
	}
	public void setInquirycontent(String inquirycontent) {
		this.inquirycontent = inquirycontent;
	}
}
