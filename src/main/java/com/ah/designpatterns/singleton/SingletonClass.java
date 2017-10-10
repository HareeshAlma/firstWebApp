package com.ah.designpatterns.singleton;

public class SingletonClass {

	
	private static SingletonClass obj;

	private SingletonClass(){
	}
	static SingletonClass getInstance(){
		if(obj==null)
		{
			obj= new SingletonClass();
		}
		return obj;
	}
	
}
