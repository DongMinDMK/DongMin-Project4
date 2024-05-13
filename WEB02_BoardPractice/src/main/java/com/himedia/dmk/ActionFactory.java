package com.himedia.dmk;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.controller.action.IdCheckAction;
import com.himedia.dmk.controller.action.JoinAction;
import com.himedia.dmk.controller.action.JoinFormAction;
import com.himedia.dmk.controller.action.LoginAction;
import com.himedia.dmk.controller.action.LoginFormAction;
import com.himedia.dmk.controller.action.board.LogoutAction;
import com.himedia.dmk.controller.action.board.MainAction;

public class ActionFactory {
	
	private ActionFactory() {
		
	}
	
	private static ActionFactory itc = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return itc;
	}
	
	
	public Action getAction(String command) {
		Action ac = null;
		
		if(command.equals("loginForm")) {
			ac = new LoginFormAction();
			
			
		}else if(command.equals("login")) {
			ac = new LoginAction();
			
		}else if(command.equals("joinForm")) {
			ac = new JoinFormAction();
		}else if(command.equals("idCheck")) {
			ac = new IdCheckAction();
		}else if(command.equals("join")) {
			ac = new JoinAction();
		}else if(command.equals("main")) {
			ac = new MainAction();
		}else if(command.equals("logout")){
			ac = new LogoutAction();
		}
		
		return ac;
		
	}
}
