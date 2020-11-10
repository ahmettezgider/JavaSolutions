package Java8.JavaLambda;
import Java8.Interfaces.Calculator;


public class Lambda18_ReturnContext {

    public static void main(String[] argv) {

        System.out.println(create().calculate(2, 2));
    }

    private static Calculator create(){

        return (x,y) -> x / y;
    }
}

/*
Return Context
We can use a lambda expression in a return statement,
and its target type is declared in the method return type.
 */