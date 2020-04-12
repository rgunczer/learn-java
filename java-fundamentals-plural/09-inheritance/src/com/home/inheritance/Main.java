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

        for (Flight ff : squadron) {
            System.out.println(ff);
        }
        fieldHiding();
        fieldHiding2();
        objectReferene();
        equality();
        specialRefSuper();
        inheritanceAndConstructor();
    }

    private static void inheritanceAndConstructor() {
        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf294 = new CargoFlight(294);
    }

    private static void specialRefSuper() {
        Flight f1 = new Flight(175);
        Flight f2 = f1;

        if (f1.equals(f2)) {
            System.out.println("equal [super]");
        }
    }

    private static void equality() {
        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);

        if (f1 == f2) { // false == does reference comparison
            System.out.println("equal == [reference]");
        } else {
            System.out.println("not equal == [reference]");
        }

        if (f1.equals(f2)) { // false default implementation does the same as ==
            System.out.println("equal using .equals");
        } else {
            System.out.println("not equal using .equals");
        }

        Passenger p = new Passenger();

        if (f1.equals(p)) {
            System.out.println("equal with passenger");
        } else {
            System.out.println("not equal with passenger");
        }

    }

    private static void objectReferene() {
        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger();
        stuff[2] = new CargoFlight();

        Object o = new Passenger();

        System.out.println(o.getClass());
        for (int i = 0; i < stuff.length; ++i) {
            System.out.println(stuff[i].getClass());
        }

        if  (o instanceof Passenger) {
            Passenger p = (Passenger)o;
            p.sayHi();
        }
    }

    private static void fieldHiding2() {
        Flight f1 = new Flight();
        System.out.println(f1.getSeats());

        CargoFlight cf = new CargoFlight();
        System.out.println(cf.getSeats());

        Flight f = new CargoFlight();
        System.out.println(f.getSeats());
    }
    private static void fieldHiding() {
        Flight f1 = new Flight();
//        System.out.println(f1.seats);

        CargoFlight cf = new CargoFlight();
//        System.out.println(cf.seats);

        Flight f2 = new CargoFlight();
//        System.out.println(f2.seats);
    }
}
