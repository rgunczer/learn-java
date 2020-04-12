package com.home.moreaboutdatatypes;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {

        basics();
        stringEquality();
        convertingNonStringTypes();
        stringBuilder();
        primitiveWrapperClasses();
    }
    
    private static void primitiveWrapperClasses() {

    }

    private static void stringBuilder() {
        StringBuilder sb = new StringBuilder(40);
        System.out.println(sb.capacity());

        Flight myFlight = new Flight(175);
        String location = "Florida";

        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on ");
        sb.append(myFlight);

        int time = 9;
        int pos = sb.length() - " on ".length() - myFlight.toString().length();
        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);

        String message = sb.toString();

        System.out.println(message);
    }

    private static void convertingNonStringTypes() {
        int iVal = 100;
        String sVal = String.valueOf(iVal);

        int i = 2;
        int j = 3;
        int result = i * j;
        System.out.println(i + " * " + j + " = " + result);

        Flight f = new Flight(175);
        System.out.println("My flight is " + f);

    }

    private static void basics() {
        String name = "Jim";
        System.out.println("Hi " + name);

        String numStr = String.valueOf(100);
        System.out.println(numStr);
        System.out.println(100);
    }

    private static void stringEquality() {
        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";

        if (s1 == s2) { // refence
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 equal s2");
        }

        String s3 = s1.intern();
        String s4 = s2.intern();

        if (s3 == s4) {
            System.out.println("s3 == s4");
        }
    }

}
