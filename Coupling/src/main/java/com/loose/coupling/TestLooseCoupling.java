package com.loose.coupling;

public class TestLooseCoupling {

	public static void main(String[] args) {

		Car c = new Car();
		Bus b = new Bus();
		Bike bk = new Bike();
		
		Traveller t = new Traveller(bk);
		t.startJourney();
		
		
	}

}
