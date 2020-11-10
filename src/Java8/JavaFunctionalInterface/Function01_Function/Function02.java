package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.function.Function;

public class Function02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Function<T, R>
        Function<String, Integer> func1 = x -> x.length();

        Integer len = func1.apply("mkyong");   // 6

        System.out.println(len);


        //--------------------------------------------------------------
        //Chain Function<T, R>
        //Function<String, Integer> func2 = String::length;
        Function<String, Integer> func2 = x -> x.length();

        Function<Integer, Integer> func3 = x -> x * 2;

        Integer result2 = func2.andThen(func3).apply("mkyong");   // 12

        System.out.println(result2);



        //--------------------------------------------------------------
        Function<Integer,String> converter = (i)-> Integer.toString(i);

        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30).length());

        //--------------------------------------------------------------
        String result3 = calc((a) -> "Result: " + (a * 2), 10);
        System.out.println(result3);
    }

    public static String calc(Function<Integer, String> function, Integer i) {
        return function.apply(i);
    }
}
