package com.home.inheritance;

public class Flight {
    int passengers;
//    int seats = 3;
    int getSeats() { return  150; }

    public void add1Passengers(Passenger p) {
        System.out.println("addPassenger: " + p);
        if (hasSeating()) {
            passengers += 1;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many!");
    }

    private boolean hasSeating() {
//        return passengers < seats;
        return passengers < getSeats();
    }
}
