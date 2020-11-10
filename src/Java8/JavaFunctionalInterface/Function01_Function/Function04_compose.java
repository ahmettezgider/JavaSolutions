package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.function.Function;

public class Function04_compose {
    public static void main(String[] args) {
        /*
            Function compose returns a composed function that
            first applies the before function to its input,
            and then applies this function to the result.
            default <V> Function<V,R> compose(Function<? super V,? extends T> before)
         */

        Function<Integer,String> converter = (i)-> Integer.toString(i);

        Function<String, Integer> reverse = (s)-> Integer.parseInt(s);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.compose(reverse).apply("30").length());
    }
}
