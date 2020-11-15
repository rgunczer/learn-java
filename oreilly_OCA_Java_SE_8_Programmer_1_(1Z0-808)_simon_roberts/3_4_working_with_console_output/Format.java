public class Format {
    public static void main(String[] args) {
        int x = 99;
        float f = 5.2F;
        System.out.printf("The count is %d, and the mean is %f\n", x, f);

        System.out.append("Hello, ")
            .append("World!")
            .append("\n");
    }
}
