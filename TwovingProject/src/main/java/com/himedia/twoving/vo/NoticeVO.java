package com.himedia.twoving.vo;

import java.sql.Timestamp;

public class NoticeVO {
	private Integer noticeid;
	private String userid;
	private String title;
	private String content;
	private Timestamp indate;
	private Integer readcount;
	public Integer getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(Integer noticeid) {
		this.noticeid = noticeid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Integer getReadcount() {
		return readcount;
	}
	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}
}
