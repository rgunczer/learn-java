package com.home.inheritance;

public class Main {

    public static void main(String[] args) {
	    CargoFlight cf = new CargoFlight();
	    cf.add1Package(1.0f, 2.5f, 3.0f);
	    cf.add1Passengers(new Passenger());


	    Flight f = new CargoFlight();
	    Passenger jane = new Passenger();
	    f.add1Passengers(jane);

//        f.add1Package(1.0f, 2.5f, 3.0f); // will not work on Flight

        Flight[] squadron = new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new CargoFlight();

        for(Flight ff: squadron) {
            System.out.println(ff);
        }

    }
}
