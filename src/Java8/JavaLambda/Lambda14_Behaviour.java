package Java8.JavaLambda;
import Java8.Interfaces.Calculator;

public class Lambda14_Behaviour {

    public static void main(String[] argv) {
        engine((x,y)-> x + y, 2, 4);
        engine((x,y)-> x * y, 3, 4);
        engine((x,y)-> x / y, 2, 5);
        engine((x,y)-> x % y, 10, 4);
    }

    private static void engine(Calculator calculator, int x, int y){
        int result = calculator.calculate(x, y);
        System.out.println(result);
    }

}

