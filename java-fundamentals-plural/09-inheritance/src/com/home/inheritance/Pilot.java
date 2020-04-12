package com.home.inheritance;

public abstract class Pilot {
    private Flight curentFlight;

    public void fly(Flight f) {
        if (canAccept(f)) {
            curentFlight = f;
        } else {
            handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight f);

    private void handleCantAccept() {
        System.out.println("Can't accept");
    }
}
