package com.sayantan.action.factory;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionInvocation;

public interface AppResult extends Serializable{
	public void execute(ActionInvocation inv) throws Exception;
}
