package com.jakipradip.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloEJBImpl implements HelloEJB {

	@Override
	public String sayHello() {
		
		return "Hello EJB";
	}

}
