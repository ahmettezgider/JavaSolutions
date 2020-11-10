package Java8.JavaFunctionalInterface.Function08_BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumer02 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);    // 3

    }
}
