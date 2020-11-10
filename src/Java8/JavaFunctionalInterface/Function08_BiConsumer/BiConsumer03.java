package Java8.JavaFunctionalInterface.Function08_BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumer03 {

    public static void main(String[] args) {

        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js

    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }

}
