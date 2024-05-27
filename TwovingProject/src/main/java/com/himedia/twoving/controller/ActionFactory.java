package com.himedia.twoving.controller;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.controller.action.help.NoticeAction;

public class ActionFactory {
	private ActionFactory() {
		
	}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {
		return itc; 
	}
	
	public Action getAction(String command) {
		Action ac = null;
		
		if(command.equals("notice")) ac = new NoticeAction();
	
		return ac;
	}
}
