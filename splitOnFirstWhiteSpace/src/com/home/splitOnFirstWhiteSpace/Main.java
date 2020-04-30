package com.home.splitOnFirstWhiteSpace;

public class Main {

    static String[] testNames = {
            "Adriana C.Ocampo Uria",
            "Albert Einstein",
            "Anna K.Behrensmeyer",
            "Blaise Pascal",
            "Caroline Herschel",
            "Cecilia Payne - Gaposchkin",
            "Chien - Shiung Wu",
            "Dorothy Hodgkin",
            "Edmond Halley",
            "Edwin Powell Hubble",
            "Elizabeth Blackburn",
            "Enrico Fermi",
            "Erwin Schroedinger",
            "Flossie Wong - Staal",
            "Frieda Robscheit - Robbins",
            "Geraldine Seydoux",
            "Gertrude B.Elion",
            "Ingrid Daubechies",
            "Jacqueline K.Barton",
            "Marie Curie",
            "Max Born",
            "Max Planck",
            "Melissa Franklin",
            "Michael Faraday",
            "Mildred S.Dresselhaus",
            "Nicolaus Copernicus",
            "Niels Bohr",
            "Patricia S.Goldman - Rakic",
            "Patty Jo Watson",
            "Polly Matzinger",
            "Richard Phillips Feynman",
            "Rita Levi - Montalcini",
            "Rosalind Franklin",
            "Ruzena Bajcsy",
            "Sarah Boysen",
            "Shannon W.Lucid",
            "Shirley Ann Jackson",
            "Sir Ernest Rutherford",
            "Sir Isaac Newton",
            "Stephen Hawking",
            "Werner Karl Heisenberg",
            "Wilhelm Conrad Roentgen",
            "Wolfgang Ernst Paul",
            "Kratos "
    };

    public static void main(String[] args) {
        for (int i = 0; i < testNames.length; ++i) {
            procName(i);
        }
    }

    private static String getStringValue(final int index) {
        return testNames[index].trim();
    }

    private static String procName(final int index) {
        String name = getStringValue(index);
        int firstWhitePos = name.indexOf(' ');

        String firstName = name;
        String lastName = "";

        if (firstWhitePos != -1) {
            firstName = name.substring(0, firstWhitePos).trim();
            lastName = name.substring(firstWhitePos).trim();
        }

        System.out.println("\nname: " + name);
        System.out.println("firstName: [" + firstName + "]");
        System.out.println("lastName: [" + lastName + "]");

        return "bar";
    }

}
