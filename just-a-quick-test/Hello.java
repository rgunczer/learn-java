
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        final var sb = new StringBuilder(40);
        sb.append("Hello");
        sb.append(" Java");
        sb.append(" from VSCode");

        final var str = sb.toString();

        System.out.println(str);
    }
}
