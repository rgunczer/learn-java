package com.home.flight;

public class Flight {
    private int passangers;
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    public Flight() {
        seats = 150;
        passangers = 0;
    }

    public void add1Passanger() {
        if (passangers < seats) {
            passangers += 1;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }

    public boolean hasRoom(Flight f2) {
        int total = passangers + f2.passangers;
//        if (total <= seats) {
//            return true;
//        } else {
//            return false;
//        }
        return  total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passangers = passangers + f2.passangers;
        return newFlight;
    }
}
