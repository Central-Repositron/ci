/**
 * @author suv
 *
 */
package com.sayantan.action.factory;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionInvocation;

public interface AppInterceptor extends Serializable{
	void init();
	void destroy();
	
	String intercept(ActionInvocation inv) throws Exception;
}
