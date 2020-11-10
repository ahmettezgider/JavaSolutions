package Java8.JavaLambda;

import Java8.Interfaces.LongCalculator;

public class Lambda17_InvocationContext {

    public static void main(String[] argv) {
        engine((x,y)-> x / y);
    }

    private static void engine(LongCalculator calculator){
        long x = 2, y = 4;
        long result = calculator.calculate(x, y);
        System.out.println(result);
    }
}



/*
Method Invocation Context
We can use a lambda expression as an argument for a method or constructor.
 */