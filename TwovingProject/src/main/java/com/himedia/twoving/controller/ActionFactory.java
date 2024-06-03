package com.himedia.twoving.controller;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.controller.action.help.CustomerInquiryAction;
import com.himedia.twoving.controller.action.help.FaqAction;
import com.himedia.twoving.controller.action.help.LoadingErrorAction;
import com.himedia.twoving.controller.action.help.MemberCustomerLoginAction;
import com.himedia.twoving.controller.action.help.MyMembershipAction;
import com.himedia.twoving.controller.action.help.NextTimeDefuseAction;
import com.himedia.twoving.controller.action.help.NonpayAction;
import com.himedia.twoving.controller.action.help.NoticeAction;
import com.himedia.twoving.controller.action.help.NoticeDetail;
import com.himedia.twoving.controller.action.help.PassTicketAction;
import com.himedia.twoving.controller.action.help.PassTicketListAction;
import com.himedia.twoving.controller.action.help.QnaListAction;
import com.himedia.twoving.controller.action.help.ServicePolicyAction;
import com.himedia.twoving.controller.action.help.ServiceRunAction;
import com.himedia.twoving.controller.action.help.UpdateDefuseCheckAction;

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
		else if(command.equals("memberCustomerLogin")) ac = new MemberCustomerLoginAction();
		else if(command.equals("passTicket")) ac = new PassTicketAction();
		else if(command.equals("loadingError")) ac = new LoadingErrorAction();
		else if(command.equals("nonpay")) ac = new NonpayAction();
		else if(command.equals("servicerun")) ac = new ServiceRunAction();
		
		// servicepolicy
		else if(command.equals("servicepolicy")) ac = new ServicePolicyAction();
		
		// customerinquiry
		else if(command.equals("customerinquiry")) ac = new CustomerInquiryAction();
		else if(command.equals("qnaList")) ac = new QnaListAction();
		else if(command.equals("nexttimedefuse")) ac = new NextTimeDefuseAction();
		
		
		//mymembership
		else if(command.equals("mymembership")) ac = new MyMembershipAction();
		else if(command.equals("passTicket")) ac = new PassTicketAction();
		else if(command.equals("updateDefuseCheck")) ac = new UpdateDefuseCheckAction();
	
		return ac;
	}
}
