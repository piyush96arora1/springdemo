package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RestService")
public  class RestService implements HomrInterface {

	/* (non-Javadoc)
	 * @see com.example.demo.service.HomrInterface#test()
	 */
	@Override
	public String test()
	{
		return "hi from rest";
	}

	@Override
	public String rest() {
		// TODO Auto-generated method stub
		return "restservice";
	}
	
}
