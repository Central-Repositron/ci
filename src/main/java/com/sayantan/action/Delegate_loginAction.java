package com.sayantan.action;

import com.sayantan.utils.AppSupport;

public class Delegate_loginAction extends AppSupport{
	/**
	 * Login action page. 
	 */
	private static final long serialVersionUID = 178303731947801496L;
	
	@Override
    public String execute() throws Exception{
        if (isInvalid(appForm.getUsername())) return I;
        if (isInvalid(appForm.getPassword())) return I;

        return S;
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }
}
