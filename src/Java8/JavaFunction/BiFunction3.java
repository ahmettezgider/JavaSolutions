package Java8.JavaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BiFunction3 {

    // Function example - 1
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1D, 25D, 100D);
        System.out.println(transformNumbers(numbers, Math::sqrt));
    }

    private static List<String> transformNumbers(List<Double> numbers, Function<Double, Double> fx) {
        List<String> appliedNumbers = new ArrayList<>();
        for (Double n : numbers) {
            appliedNumbers.add(String.valueOf(fx.apply(n)));
        }
        return appliedNumbers;
    }

    // Function example - 2
    public static void FunctionDemo() {
        List<Integer> _numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> lambda = value -> value * 2;
        List<Integer> doubled = _numbers.stream()
                .map(lambda)
                .collect(java.util.stream.Collectors.toList());

        System.out.println(doubled);
    }

}
