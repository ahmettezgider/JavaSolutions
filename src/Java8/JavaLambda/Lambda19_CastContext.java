package Java8.JavaLambda;

import Java8.Interfaces.LongCalculator;
import Java8.Interfaces.IntCalculator;

public class Lambda19_CastContext{

    public static void main(String[] argv) {
        engine((IntCalculator) ((x,y)-> x + y));
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



