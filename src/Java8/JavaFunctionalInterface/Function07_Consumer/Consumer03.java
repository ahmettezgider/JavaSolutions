package Java8.JavaFunctionalInterface.Function07_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer03 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // implementation of the Consumer's accept methods.
        Consumer<Integer> consumer = (Integer x) -> System.out.print(x + " ");
        forEach(list, consumer);    // 1 2 3 4 5


        // or call this directly
        forEach(list, (Integer x) -> System.out.print(x + " "));    // 1 2 3 4 5

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
