package Java8.JavaFunctionalInterface.Function07_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer04 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "ab", "abc");
        forEach(list, (String x) -> System.out.println(x.length()));

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
