package com.home.constructors;

public class Main {

    public static void main(String[] args) {
        Earth e = new Earth();
        System.out.println(e.circumferenceInMiles);
        System.out.println(e.getCircumferenceInKilometers);

        Passenger bob = new Passenger();
        bob.setCheckedBags(3);

        Passenger jane = new Passenger(2);
        jane.setCheckedBags(3);
    }
}
