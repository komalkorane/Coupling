package com.tight.coupling;

public class Traveller {

	
	public static void startJourney() {
		System.out.println("start Journey");
		Car c = new Car();
				c.run();
//		Bus b = new Bus();
//		     b.run();
//		System.out.println("journey started by " + c.getClass().getName());
		System.out.println("journey started by " + c.getClass().getSimpleName());
//		System.out.println("journey started by " + b.getClass().getSimpleName());
		
		
	}

}
