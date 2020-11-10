package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function06_identity {
    public static void main(String[] args) {

        Function<Integer,Integer> id = Function.identity();
        System.out.println(id.apply(3));

        //-------------------------------------------------------------------
        Function<Double, Double> square = number -> number * number;
        Function<Double, Double> half = number -> number * 2;

        List<Double> numbers = Arrays.asList(10D, 4D, 12D);
        // you can use identity to not modify them
        System.out.println(mapIt(numbers, Function.<Double>identity()));

    }


    private static List<Double> mapIt(List<Double> numbers, Function<Double, Double> fx) {
        List<Double> result = new ArrayList<>();

        for (Double number : numbers) {
            result.add(fx.apply(number));
        }

        return result;
    }
}

/*
Function identity returns a function that always returns its input argument.

Syntax
identity has the following syntax.

static <T> Function<T,T> identity()
 */