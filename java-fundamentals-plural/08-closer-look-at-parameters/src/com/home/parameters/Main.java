package com.home.parameters;

public class Main {

    public static void main(String[] args) {
	    Flight f = new Flight();

	    Passenger janet = new Passenger(0, 1);
	    Passenger john = new Passenger(1, 1);

//	    f.addPassengers(new Passenger[] { janet, john });
	    f.addPassengers(janet, john);
    }
}
