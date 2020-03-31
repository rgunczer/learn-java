package com.home.constructors;

public class Earth {
    long circumferenceInMiles = 24901;
//    long getCircumferenceInKilometers = (long) (circumferenceInMiles * 1.6d);
    long getCircumferenceInKilometers = Math.round (circumferenceInMiles * 1.6d);
}
