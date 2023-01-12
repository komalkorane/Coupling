package com.loose.coupling.demo;

public class Traveller {

	Vehicle v;

	public Traveller(Vehicle v) {
		super();
		this.v = v;
	}
	
	public void startJourney() {
		v.run();
	}
	
}
