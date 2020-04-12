package com.home.moreaboutdatatypes;

public class Flight {
    int flightNumber;
    char flightClass;

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        if (flightNumber > 0) {
            return "Flight #" + flightNumber;
        } else {
            return "Flight Class " + flightClass;
        }
    }
}
