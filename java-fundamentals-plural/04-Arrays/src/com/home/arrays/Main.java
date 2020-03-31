package com.home.arrays;

public class Main {

    public static void main(String[] args) {

//        float[] theVals = new float[3];
//        theVals[0] = 1.0f;
//        theVals[1] = 10.0f;
//        theVals[2] = 100.0f;

        float[] theVals = { 1.0f, 10.0f, 100.0f };

        float sum = 0.0f;

        // for loop
//        for(int i = 0; i < theVals.length; ++i) {
//            sum += theVals[i];
//        }

        // foreach loop
        for(float val : theVals) {
            sum += val;
        }

        System.out.println(sum);
    }
}
