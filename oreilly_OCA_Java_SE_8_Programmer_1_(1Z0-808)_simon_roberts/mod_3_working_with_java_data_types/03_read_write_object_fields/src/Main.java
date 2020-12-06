public class Main {
    public static void main(String[] args) {
        Thing t = new Thing();
//        int n = t.numOne;
//        System.out.println("value read is " + n);
//
//        System.out.println("t is " + t);
//        t.numOne = 99;
//        t.numTwo = 100;
//        System.out.println("t is " + t);
//
//        Box b = new Box();
//
//        System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
//        b.getOneThing().numOne = 5432;
//        System.out.println("numOne in a boxed thing is " + b.getOneThing().numOne);
//
//        System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);
//        b.getManyThings()[0].numOne = 6789;
//        System.out.println("numOne in another boxed thing is " + b.getManyThings()[0].numOne);

//        System.out.println("t is " + t);
//        t.doStuff();
//        System.out.println("t is " + t);

//        System.out.println("t is the same reference as \"this\" "
//                + "inside a method called on t? " + t.sameAs(t));

        int age = 10;
        Integer kor = age;

        System.out.println("age " + age);
        System.out.println("kor " + kor);

        int j = kor;
        System.out.println("j " + j);

        System.out.println(Byte.BYTES);
        System.out.println(Short.BYTES);
        System.out.println(Integer.BYTES);
        System.out.println(Long.BYTES);

        System.out.println(Integer.toHexString(255));

    }
}
