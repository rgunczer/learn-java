package com.home.flight;

public class Main {

    public static void main(String[] args) {
	    Flight flight1 = new Flight();
	    flight1.add1Passanger();
//	    System.out.println(flight1.passangers);

		MyClass m = new MyClass();
		m.showSum(7.5f, 1.4f, 3);

		Flight lax1 = new Flight();
		Flight lax2 = new Flight();

		Flight lax3 = null;

		if (lax1.hasRoom(lax2)) {
			lax3 = lax1.createNewWithBoth(lax2);
		}

		if (lax3 != null) {
			System.out.println("Flights Combined");
		}

		Flight slcToNyc = new Flight();
		slcToNyc.setSeats(150);
		System.out.println(slcToNyc.getSeats());

    }
}
