package com.loose.coupling;

public class Traveller {

	Vehicle v;

	public Traveller(Vehicle v) {
		super();
		this.v = v;
	}
	
	public void startJourney() {
		
		System.out.println("Journey started by "+v.getClass().getSimpleName());
		v.run();
		
	}
	
	
}
