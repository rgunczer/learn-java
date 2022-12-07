import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Method References\n");

        lambdaExpression();
        methodReference();
        consumer();
    }

    private static void lambdaExpression() {
        System.out.println("lambda expression");

        Stream
            .of(3, 1, 5)
            .forEach(
                x -> System.out.println(x) // <-- lambda expression
            );

        System.out.println("\n");
    }

    private static void methodReference() {
        System.out.println("method reference");

        Stream
            .of(3, 1, 5)
            .forEach(
                System.out::println // <-- method reference ::
            );

        System.out.println("\n");
    }

    private static void consumer() {
        System.out.println("consumer");

        Consumer<Integer> printer = System.out::println;
        Stream
            .of(3, 1, 5)
            .forEach(printer);

    }

}
