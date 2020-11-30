package packageone;

import packageone.subpackage.ClassB;
//import packagetwo.ClassOne;

public class Imports2 {

    public static void main(String[] args) {
        System.out.println("Imports2");

        ClassOne cOne = new ClassOne();
        System.out.println(cOne.toString());

        packageone.subpackage.ClassA cA = new packageone.subpackage.ClassA();
        System.out.println(cA.toString());

        ClassB cB = new ClassB();
        System.out.println(cB.toString());

        packagetwo.ClassOne cOneAgain = new packagetwo.ClassOne();
        System.out.println(cOneAgain.toString());
    }

}
