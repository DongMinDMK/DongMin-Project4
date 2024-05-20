package com.himedia.shop.dmk.controller;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.controller.action.IndexAction;
import com.himedia.shop.dmk.controller.action.member.ContractAction;
import com.himedia.shop.dmk.controller.action.member.FindZipNumAction;
import com.himedia.shop.dmk.controller.action.member.IdCheckAction;
import com.himedia.shop.dmk.controller.action.member.JoinFormAction;
import com.himedia.shop.dmk.controller.action.member.LoginAction;
import com.himedia.shop.dmk.controller.action.member.LoginFormAction;
import com.himedia.shop.dmk.controller.action.member.LogoutAction;

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
		
		return ac;
	}
	


}
