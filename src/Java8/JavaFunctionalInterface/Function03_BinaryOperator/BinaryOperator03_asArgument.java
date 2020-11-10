package Java8.JavaFunctionalInterface.Function03_BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperator03_asArgument {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //--------------------------------------------------------------------
        Integer result1 = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
        System.out.println(result1);    // 55

        //--------------------------------------------------------------------
        Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);
        System.out.println(result2);    // 55

        //--------------------------------------------------------------------
        int result3 = Arrays.stream(numbers).reduce(0, (x,y) -> x+y);
        System.out.println(result3);    // 55

        //--------------------------------------------------------------------
        int result4 = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(result4);    // 55
    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }
}
