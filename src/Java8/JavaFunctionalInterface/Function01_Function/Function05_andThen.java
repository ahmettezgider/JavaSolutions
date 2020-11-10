package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.function.Function;

public class Function05_andThen {

    public static void main(String[] args) {

        Function<Integer,String> converter = (i)-> Integer.toString(i);

        Function<String, Integer> reverse = (s)-> Integer.parseInt(s);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.andThen(reverse).apply(30).byteValue());

    }
}

/*
Function andThen returns a composed function that first applies this function to its input,
and then applies the after function to the result.

Syntax
andThen has the following syntax.

default <V> Function<T,V> andThen(Function<? super R,? extends V> after)

 */
