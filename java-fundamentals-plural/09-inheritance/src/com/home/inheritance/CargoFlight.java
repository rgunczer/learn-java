package com.home.inheritance;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public CargoFlight() {}

    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight(int flightNumber, int maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    //    int seats = 12;
    @Override
    int getSeats() {
        return 12;
    }

    public final void add1Package(float h, float w, float d) { // cannot override this method [final]
        double size = h * w * d;
        if (hasCargoSpace((float) size)) {
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

}
