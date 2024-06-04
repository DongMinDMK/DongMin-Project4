package com.himedia.twoving.controller;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.controller.action.IndexAction;
import com.himedia.twoving.controller.action.TmainAction;
import com.himedia.twoving.controller.action.admin.AdminAction;
import com.himedia.twoving.controller.action.admin.AdminCustomerInquiryDetailAction;
import com.himedia.twoving.controller.action.admin.AdminCustomerInquiryListAction;
import com.himedia.twoving.controller.action.admin.AdminCustomerInquiryReplyUpdateAction;
import com.himedia.twoving.controller.action.admin.AdminFaqDeleteAction;
import com.himedia.twoving.controller.action.admin.AdminFaqDetailAction;
import com.himedia.twoving.controller.action.admin.AdminFaqListAction;
import com.himedia.twoving.controller.action.admin.AdminFaqUpdateAction;
import com.himedia.twoving.controller.action.admin.AdminFaqUpdateFormAction;
import com.himedia.twoving.controller.action.admin.AdminFaqWriteAction;
import com.himedia.twoving.controller.action.admin.AdminFaqWriteFormAction;
import com.himedia.twoving.controller.action.admin.AdminLogoutAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeDeleteAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeDetailAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeListAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeUpdateAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeUpdateFormAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeWriteAction;
import com.himedia.twoving.controller.action.admin.AdminNoticeWriteFormAction;
import com.himedia.twoving.controller.action.admin.AdminProductDeleteAction;
import com.himedia.twoving.controller.action.admin.AdminProductDetailAction;
import com.himedia.twoving.controller.action.admin.AdminProductListAction;
import com.himedia.twoving.controller.action.admin.AdminProductUpdateAction;
import com.himedia.twoving.controller.action.admin.AdminProductUpdateFormAction;
import com.himedia.twoving.controller.action.admin.AdminProductWriteAction;
import com.himedia.twoving.controller.action.admin.AdminProductWriteFormAction;
import com.himedia.twoving.controller.action.admin.AdminloginAction;
import com.himedia.twoving.controller.action.help.AllPassTicketViewAction;
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
import com.himedia.twoving.controller.action.mypage.CustomerInquiryListMypage;
import com.himedia.twoving.controller.action.mypage.CustomerInquiryMypageDetail;
import com.himedia.twoving.product.detailAction;
import com.himedia.twoving.product.genreAction;
import com.himedia.twoving.product.kindAction;
import com.himedia.twoving.product.searchListAction;
import com.himedia.twoving.product.steamedDeleteAction;
import com.himedia.twoving.product.steamedInsertAction;
import com.himedia.twoving.product.steamedListAction;
import com.twoving.controller.action.member.JoinAction;
import com.twoving.controller.action.member.JoinFormAction;
import com.twoving.controller.action.member.LoginAction;
import com.twoving.controller.action.member.LoginFormAction;
import com.twoving.controller.action.member.MainAction;
import com.twoving.controller.action.member.indexFormAction;
import com.twoving.controller.action.mypage.DeleteMemberAction;
import com.twoving.controller.action.mypage.FindIdAction;
import com.twoving.controller.action.mypage.FindPwdAction;
import com.twoving.controller.action.mypage.MypageAction;
import com.twoving.controller.action.mypage.TicketAction;
import com.twoving.controller.action.mypage.UpdateMemberAction;
import com.twoving.controller.action.mypage.UpdateMemberFormAction;

public class ActionFactory {
	private ActionFactory() {
		
	}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {
		return itc; 
	}
	
	public Action getAction(String command) {
		Action ac = null;
			if(command.equals("index")) ac = new IndexAction();
			
		  //main(김재연)
			else if(command.equals("tMain")) ac = new TmainAction();
		  else if(command.equals("Tdetail")) ac = new detailAction();
	      else if(command.equals("genre")) ac = new genreAction();
	      else if(command.equals("kind")) ac = new kindAction();
	      else if(command.equals("searchList")) ac = new searchListAction();
	      else if(command.equals("steamedInsert")) ac= new steamedInsertAction();
	      else if(command.equals("steamedList")) ac = new steamedListAction();
	      else if(command.equals("steamedDelete")) ac= new steamedDeleteAction();
	      
	      
	      // index(박단비)
	      else if(command.equals("loginForm")) ac = new LoginFormAction();
	      else if(command.equals("login")) ac = new LoginAction();
	      else if(command.equals("joinForm")) ac = new JoinFormAction();
	      else if(command.equals("indexForm")) ac = new indexFormAction();
	      else if(command.equals("join")) ac = new JoinAction();
	      else if(command.equals("main")) ac = new MainAction();
	      else if(command.equals("mypage")) ac = new MypageAction();
	      else if(command.equals("updateMember")) ac = new UpdateMemberAction();
	      else if(command.equals("updateMemberForm")) ac = new UpdateMemberFormAction();
	      else if(command.equals("deleteMember")) ac = new DeleteMemberAction();
	      else if(command.equals("findId")) ac = new FindIdAction();
	      else if(command.equals("findPwd")) ac = new FindPwdAction();
	      else if(command.equals("ticket")) ac = new TicketAction();
	      
		
		// notice(김동민)
	    else if(command.equals("notice")) ac = new NoticeAction();
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
		else if(command.equals("passTicketList")) ac = new PassTicketListAction();
		else if(command.equals("updateDefuseCheck")) ac = new UpdateDefuseCheckAction();
		else if(command.equals("allPassTicketView")) ac = new AllPassTicketViewAction();
		
		
		  //admin(오수완)
	      //시리즈 영화
		  else if( command.equals("admin") ) ac = new AdminAction();
	      else if( command.equals("adminlogin") ) ac = new AdminloginAction();
	      else if( command.equals("adminLogout") ) ac = new AdminLogoutAction();
	      else if( command.equals("adminProductList") ) ac = new AdminProductListAction();
	      else if( command.equals("adminProductWriteForm") ) ac = new AdminProductWriteFormAction();
	      else if( command.equals("adminProductWrite") ) ac = new AdminProductWriteAction();
	      else if( command.equals("adminProductDetail") ) ac = new AdminProductDetailAction();
	      else if( command.equals("adminProductUpdateForm") ) ac = new AdminProductUpdateFormAction(); 
	      else if( command.equals("adminProductUpdate") ) ac = new AdminProductUpdateAction();
	      else if( command.equals("adminProductDelete") ) ac = new AdminProductDeleteAction();
	      
	      //Notice
	      else if( command.equals("adminNoticeList") ) ac = new AdminNoticeListAction();
	      else if( command.equals("adminNoticeWriteForm") ) ac = new AdminNoticeWriteFormAction();
	      else if( command.equals("adminNoticeWrite") ) ac = new AdminNoticeWriteAction();
	      else if( command.equals("adminNoticeDetail") ) ac = new AdminNoticeDetailAction();
	      else if( command.equals("adminNoticeUpdateForm") ) ac = new AdminNoticeUpdateFormAction();
	      else if( command.equals("adminNoticeUpdate") ) ac = new AdminNoticeUpdateAction();
	      else if( command.equals("adminNoticeDelete") ) ac = new AdminNoticeDeleteAction();
	      
	      //Faq
	      else if( command.equals("adminFaqList") ) ac = new AdminFaqListAction();
	      else if( command.equals("adminFaqWriteForm") ) ac = new AdminFaqWriteFormAction();
	      else if( command.equals("adminFaqWrite") ) ac = new AdminFaqWriteAction();
	      else if( command.equals("adminFaqDetail") ) ac = new AdminFaqDetailAction();
	      else if( command.equals("adminFaqUpdateForm") ) ac = new AdminFaqUpdateFormAction();
	      else if( command.equals("adminFaqUpdate") ) ac = new AdminFaqUpdateAction();
	      else if( command.equals("adminFaqDelete") ) ac = new AdminFaqDeleteAction();
	      
	      //고객문의
	      else if( command.equals("adminCustomerInquiryList") ) ac = new AdminCustomerInquiryListAction();
	      else if( command.equals("adminCustomerInquiryDetail") ) ac = new AdminCustomerInquiryDetailAction();
	      else if( command.equals("adminCustomerInquiryReplyUpdateAction") ) ac = new AdminCustomerInquiryReplyUpdateAction();
	      
	      //고객문의 내역(마이페이지)
	      else if( command.equals("customerInquiryListMypage") ) ac = new CustomerInquiryListMypage();
	      else if( command.equals("customerInquiryMypageDetail") ) ac = new CustomerInquiryMypageDetail();
	
		return ac;
	}
}
