package com.home.parameters;

public class Flight {

//    public void addPassengers(Passenger[] list) {
    public void addPassengers(Passenger... list) {
        System.out.println("addPassenger: " + list.length);
    }

}
