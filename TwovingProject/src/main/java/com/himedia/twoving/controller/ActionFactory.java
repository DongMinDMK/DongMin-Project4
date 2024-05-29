package com.himedia.twoving.controller;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.controller.action.help.CustomerInquiryAction;
import com.himedia.twoving.controller.action.help.FaqAction;
import com.himedia.twoving.controller.action.help.NextTimeDefuseAction;
import com.himedia.twoving.controller.action.help.NoticeAction;
import com.himedia.twoving.controller.action.help.NoticeDetail;
import com.himedia.twoving.controller.action.help.QnaListAction;

public class ActionFactory {
	private ActionFactory() {
		
	}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {
		return itc; 
	}
	
	public Action getAction(String command) {
		Action ac = null;
		
		// notice
		if(command.equals("notice")) ac = new NoticeAction();
		else if(command.equals("noticeDetail")) ac = new NoticeDetail();
		
		// faq
		else if(command.equals("faq")) ac = new FaqAction();
		
		// customerinquiry
		else if(command.equals("customerinquiry")) ac = new CustomerInquiryAction();
		else if(command.equals("qnaList")) ac = new QnaListAction();
		else if(command.equals("nexttimedefuse")) ac = new NextTimeDefuseAction();
	
		return ac;
	}
}
