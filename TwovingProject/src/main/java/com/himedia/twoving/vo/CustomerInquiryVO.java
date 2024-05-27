package com.himedia.twoving.vo;

public class CustomerInquiryVO {
	
	private int ciseq;
	private String name;
	private String phone;
	private String inquiryList; //문의종류
	private String device; // 디바이스
	private String runtime; //이용시간(문의할 때 사용한 이용시간)
	private String runcontent; //이용콘텐츠
	private String inquirytitle; //문의제목
	private String inquirycontent; //문의내용
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
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
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
