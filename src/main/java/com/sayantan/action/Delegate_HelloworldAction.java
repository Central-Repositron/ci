package com.sayantan.action;

import com.sayantan.utils.AppSupport;

public class Delegate_HelloworldAction extends AppSupport{
	private static final long serialVersionUID = 5434594636343145243L;
	//private static final Logger logger = Logger.getLogger(Delegate_HelloworldAction.class);

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
