package com.ah.interfaceexample;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlanetFactory planetfactory = new PlanetFactory();
		Planet planet = planetfactory.createPlanet("sun");
		System.out.println(planet.getName());
		
		
	}

}
