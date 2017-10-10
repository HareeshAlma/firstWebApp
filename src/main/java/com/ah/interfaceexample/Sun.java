package com.ah.interfaceexample;

public class Sun implements Planet,Environment {
String name;
	public String getName(){
		name = "sun";
		System.out.println("getname() from Sun class called");
		return name;
	}
	public int getPosition(){
		
		System.out.println("getposition() from sun class called");
		return 2;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	public Boolean isLiveable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
