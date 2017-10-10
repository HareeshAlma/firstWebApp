package com.ah.interfaceexample;

public class PlanetFactory {

	public Planet createPlanet(String planetName){
		if(planetName.equalsIgnoreCase("sun"))
			return new Sun();
		else if(planetName.equalsIgnoreCase("Moon"))
			return new Moon();
		else if(planetName.equalsIgnoreCase("Earth"))
			return new Earth();
		else
			return null;
		
	}
	
}
