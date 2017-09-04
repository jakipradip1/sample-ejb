package com.jakipradip.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloEJB {
	String sayHello();
}
