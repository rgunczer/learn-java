package com.home.inheritance;

public class Flight {
    int flightNumber;
    int passengers;
//    int seats = 3;
    int getSeats() { return  150; }

    public Flight() {}
    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Flight) {
            Flight other = (Flight) o;
            return flightNumber == other.flightNumber;
        }
        return false;
    }
}
