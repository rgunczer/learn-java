
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        StringBuilder sb = new StringBuilder(40);
        sb.append("Hello");
        sb.append(" Java");
        sb.append(" from VSCode");

        String str = sb.toString();

        System.out.println(str);
    }
}
