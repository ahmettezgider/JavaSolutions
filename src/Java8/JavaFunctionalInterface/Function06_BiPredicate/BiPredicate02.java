package Java8.JavaFunctionalInterface.Function06_BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicate02 {

    public static void main(String[] args) {

        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
    }
}
