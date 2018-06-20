package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("HomeService")
public  class HomeService implements HomrInterface {

	/* (non-Javadoc)
	 * @see com.example.demo.service.HomrInterface#test()
	 */
	@Override
	public String test()
	{
		return "hi";
	}

	@Override
	public String rest() {
		// TODO Auto-generated method stub
		return "resr";
	}
	
}
