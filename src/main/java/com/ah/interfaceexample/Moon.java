package com.ah.interfaceexample;

public class Moon implements Planet,Environment {

public String getName(){
		
		System.out.println("getname() from Moon class called");
		return "Moon";
		
	}
	public int getPosition(){
		
		System.out.println("getposition() from Moon class called");
		return 1;
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isExplored(){
		return true;
	}
	public Boolean isLiveable() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
