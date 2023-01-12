package com.loose.coupling.demo;

public class Test {
public static void main(String[] args) {
	
	Bus b = new Bus();
	Traveller t1 = new Traveller(b);
	t1.startJourney();
	
	
}
}