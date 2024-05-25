package com.himedia.shop.dmk.controller;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.controller.action.IndexAction;
import com.himedia.shop.dmk.controller.action.cart.CartDeleteAction;
import com.himedia.shop.dmk.controller.action.cart.CartInsertAction;
import com.himedia.shop.dmk.controller.action.cart.CartListAction;
import com.himedia.shop.dmk.controller.action.cart.OrderInsertAction;
import com.himedia.shop.dmk.controller.action.cart.OrderInsertOneAction;
import com.himedia.shop.dmk.controller.action.cart.OrderListAction;
import com.himedia.shop.dmk.controller.action.member.ContractAction;
import com.himedia.shop.dmk.controller.action.member.FindZipNumAction;
import com.himedia.shop.dmk.controller.action.member.IdCheckAction;
import com.himedia.shop.dmk.controller.action.member.JoinAction;
import com.himedia.shop.dmk.controller.action.member.JoinFormAction;
import com.himedia.shop.dmk.controller.action.member.LoginAction;
import com.himedia.shop.dmk.controller.action.member.LoginFormAction;
import com.himedia.shop.dmk.controller.action.member.LogoutAction;
import com.himedia.shop.dmk.controller.action.mypage.MyPageAction;
import com.himedia.shop.dmk.controller.action.mypage.OrderAllAction;
import com.himedia.shop.dmk.controller.action.mypage.OrderDetailAction;
import com.himedia.shop.dmk.controller.action.mypage.QnaListAction;
import com.himedia.shop.dmk.controller.action.mypage.QnaViewAction;
import com.himedia.shop.dmk.controller.action.mypage.QnaWriteAction;
import com.himedia.shop.dmk.controller.action.mypage.QnaWriteFormAction;
import com.himedia.shop.dmk.controller.action.mypage.UpdateMemberAction;
import com.himedia.shop.dmk.controller.action.mypage.UpdateMemberFormAction;
import com.himedia.shop.dmk.controller.action.product.CategoryAction;
import com.himedia.shop.dmk.controller.action.product.ProductDetailAction;

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
		
		// member
		else if(command.equals("loginForm")) ac = new LoginFormAction();
		else if(command.equals("login")) ac = new LoginAction();
		else if(command.equals("logout")) ac = new LogoutAction();
		else if(command.equals("contract")) ac = new ContractAction();
		else if(command.equals("joinForm")) ac = new JoinFormAction();
		else if(command.equals("idCheck")) ac = new IdCheckAction();
		else if(command.equals("findZipNum")) ac = new FindZipNumAction();
		else if(command.equals("join")) ac = new JoinAction();
		
		// product
		else if(command.equals("category")) ac = new CategoryAction();
		else if(command.equals("productDetail")) ac = new ProductDetailAction();
		
		// mypage
		else if(command.equals("cartInsert")) ac = new CartInsertAction();
		else if(command.equals("cartList")) ac = new CartListAction();
		else if(command.equals("cartDelete")) ac = new CartDeleteAction();
		else if(command.equals("orderInsert")) ac = new OrderInsertAction();
		else if(command.equals("orderList")) ac = new OrderListAction();
		else if(command.equals("orderInsertOne")) ac = new OrderInsertOneAction();
		else if(command.equals("mypage")) ac = new MyPageAction();
		else if(command.equals("orderDetail")) ac = new OrderDetailAction();
		else if(command.equals("orderAll")) ac = new OrderAllAction();
		else if(command.equals("updateMemberForm")) ac = new UpdateMemberFormAction();
		else if(command.equals("updateMember")) ac = new UpdateMemberAction();
		else if(command.equals("qnaList")) ac = new QnaListAction();
		else if(command.equals("qnaView")) ac = new QnaViewAction();
		else if(command.equals("qnaWriteForm")) ac = new QnaWriteFormAction();
		else if(command.equals("qnaWrite")) ac = new QnaWriteAction();
		
		return ac;
	}
	


}
