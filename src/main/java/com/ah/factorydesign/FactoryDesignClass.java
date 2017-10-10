package com.ah.factorydesign;

public class FactoryDesignClass {

	public Office getInstance(String s){
		
		if(s.equals("branch1"))
			return new Branch1();
		else if(s.equals("branch2"))
			return new Branch2();
		else
			return new Branch3();
		
		
	}
	
}
