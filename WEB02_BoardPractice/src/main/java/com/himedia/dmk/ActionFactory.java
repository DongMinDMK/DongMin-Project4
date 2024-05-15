package com.himedia.dmk;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.controller.action.DeleteMemberAction;
import com.himedia.dmk.controller.action.IdCheckAction;
import com.himedia.dmk.controller.action.JoinAction;
import com.himedia.dmk.controller.action.JoinFormAction;
import com.himedia.dmk.controller.action.LoginAction;
import com.himedia.dmk.controller.action.LoginFormAction;
import com.himedia.dmk.controller.action.UpdateMemberAction;
import com.himedia.dmk.controller.action.UpdateMemberFormAction;
import com.himedia.dmk.controller.action.board.InsertBoardAction;
import com.himedia.dmk.controller.action.board.InsertBoardFormAction;
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
		}else if(command.equals("updateMemberForm")) {
			ac = new UpdateMemberFormAction();
		}else if(command.equals("updateMember")) {
			ac = new UpdateMemberAction();
		}else if(command.equals("deleteMember")) {
			ac = new DeleteMemberAction();
		}
		
		// board
		else if(command.equals("insertBoardForm")) {
			ac = new InsertBoardFormAction();
		}else if(command.equals("insertBoard")) {
			ac = new InsertBoardAction();
		}
		
		
		return ac;
		
	}
}
