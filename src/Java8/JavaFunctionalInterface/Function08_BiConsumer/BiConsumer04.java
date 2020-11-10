package Java8.JavaFunctionalInterface.Function08_BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumer04 {

    public static void main(String[] args) {

        math(1, 1, (x, y) -> System.out.println(x + y));   // 2
        math(1, 1, (x, y) -> System.out.println(x - y));   // 0
        math(1, 1, (x, y) -> System.out.println(x * y));   // 1
        math(1, 1, (x, y) -> System.out.println(x / y));   // 1

    }

    static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
        c.accept(a1, a2);
    }
}
