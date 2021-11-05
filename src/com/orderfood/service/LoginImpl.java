package com.orderfood.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoginImpl implements ILogin{

	@Override
	public boolean verifyUser(String userName, String password) {
		// TODO Auto-generated method stub
		boolean result=false;
		String storedPassword;
		Map<String,String> users=new HashMap<String, String>();
		users.put("user","user");
		users.put("akash","password");
		users.put("food","food");
		
		if(users.containsKey(userName)) {
			 storedPassword=users.get(userName);
			 if(storedPassword.equals(password)) {
				 result=true;
			 }
		}
		
		
		return result;
	}
	

}
