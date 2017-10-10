package com.ah.interfaceexample;

public class PlanetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planet sun = new Sun();
		Moon moon = new Moon();
		Planet earth = new Earth();
		
		Planet moon1 = new Moon();
			System.out.println(moon1.getName());
		Moon moon2 = new Moon();
			System.out.println(moon2.isLiveable());
		Environment moon3 = new Moon();
			System.out.println(moon3.isLiveable());
			
		//System.out.println((Moon)moon);
		
		
		sun.print();
		System.out.println();
		System.out.println(moon.getName());
		System.out.println(earth.getName());
		System.out.println(Planet.numberOfPlanets);
		System.out.println(sun.numberOfPlanets);
		
		System.out.println(moon.isExplored());
		
	
		
	}

}
