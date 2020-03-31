package com.home.typeconversion;

public class Main {

    public static void main(String[] args) {

        float floatValue = 1.0f;
        double doubleValue = 4.0d;
        byte byteValue = 7;
        short shortValue = 7;
        long longValue = 5;

//        short result = byteValue;
//        short result = (short)longValue;
//        short result = (short)(byteValue - longValue);
//        long result = longValue - floatValue;
        float result = longValue - floatValue;

        System.out.println("Success");
    }
}
