package Java8.JavaLambda;

import Java8.Interfaces.IntCalculator;
import Java8.Interfaces.LongCalculator;

public class Lambda15_parameterizationAmbiguity {

    public static void main(String[] argv) {
        engine((int x,int y)-> x + y);
        engine((long x, long y)-> x * y);
        engine((int x,int y)-> x / y);
        engine((long x,long y)-> x % y);
    }

    private static void engine(IntCalculator calculator){
        int x = 2, y = 4;
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }

    private static void engine(LongCalculator calculator){
        long x = 2, y = 4;
        long result = calculator.calculate(x,y);
        System.out.println(result);
    }
}
