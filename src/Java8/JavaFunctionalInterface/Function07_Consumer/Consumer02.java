package Java8.JavaFunctionalInterface.Function07_Consumer;

import java.util.function.Consumer;

public class Consumer02 {

    public static void main(String[] args) {

        Consumer<String> print = x -> System.out.println(x);

        print.accept("java");   // java

    }

}
