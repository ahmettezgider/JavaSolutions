package Java8.JavaMethodReference;

import java.util.function.BiFunction;

class Multiplication{
    public static int multiply(int a, int b){
        return a*b;
    }
}

// Method reference to a static method of a class
public class MethodReference03 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;

        int pr = product.apply(11, 5);

        System.out.println("Product of given number is: "+pr);
    }
}
