package com.home.constructors;

public class Flight {
    private int passenger;
    private int flightNumber;
    private int seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;

//    public Flight() {
//        isSeatAvailable = new boolean[seats];
//        for (int i = 0; i < seats; ++i) {
//            isSeatAvailable[i] = true;
//        }
//    }

    // initialization block
    {
        System.out.println("initialization block");
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; ++i) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight() {
    }

    public Flight(int flightNumber) {
//        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
//        this();
        this.flightClass = flightClass;
    }
}
