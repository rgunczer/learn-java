package com.home.logicaloperators;

public class Main {

    public static void main(String[] args) {

        int students = 150;
        int rooms = 0;

//        if (rooms > 0 & students / rooms > 30) { // performs both sides
         if (rooms > 0 && students / rooms > 30) { // performs both sides
            System.out.println("Crowded!!");
        }

        System.out.println();
        System.out.println("** end program **");
    }
}
