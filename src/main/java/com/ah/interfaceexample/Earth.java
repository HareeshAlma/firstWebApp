package com.ah.interfaceexample;

public class Earth implements Planet,Environment{

public String getName(){
		
		System.out.println("getname() from Earth class called");
		return "earth";
		
	}
	public int getPosition(){
		
		System.out.println("getposition() from Earth class called");
		return 3;
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
	public Boolean isLiveable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
