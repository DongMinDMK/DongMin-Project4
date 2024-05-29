package com.himedia.twoving.vo;

import java.sql.Timestamp;

public class FaqVO {
	private int qseq;
	private String inquirylist;
	private String subject;
	private String content;
	private Timestamp indate;
	public int getQseq() {
		return qseq;
	}
	public void setQseq(int qseq) {
		this.qseq = qseq;
	}
	public String getInquirylist() {
		return inquirylist;
	}
	public void setInquirylist(String inquirylist) {
		this.inquirylist = inquirylist;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
}
