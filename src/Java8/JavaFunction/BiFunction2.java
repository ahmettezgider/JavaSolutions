package Java8.JavaFunction;

import java.util.function.BiFunction;

public class BiFunction2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);

        System.out.println(result);

    }
}

class Calculator {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {

        return bi.apply(i1, i2);
    }
}
