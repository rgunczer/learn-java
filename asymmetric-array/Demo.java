public class Demo {

    static String[][] myArray = {
        new String[] {"One", "Two"},
        new String[] {"Three", "Four", "Five"}
    };

    public static void main(String[] args) {
        System.out.println("Demo...");
        System.out.println(myArray[0][1]); // Two
        System.out.println(myArray[1][0]); // Three
    }

}
