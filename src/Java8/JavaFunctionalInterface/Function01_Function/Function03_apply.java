package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.function.Function;

public class Function03_apply {

    public static void main(String[] args) {

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
