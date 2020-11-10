package Java8.JavaLambda;

import java.util.function.BooleanSupplier;
import Java8.Interfaces.MyIntegerCalculator;
import Java8.Interfaces.Processor;

public class Lambda13_implicitLambda {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------
        MyIntegerCalculator myIntegerCalculator = (Integer s1) -> s1 * 2;
        System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));


        //-----------------------------------------------------------------------
        // Here is the without using the type of above example
        MyIntegerCalculator myIntegerCalculator1 = (s1) -> s1 * 2;
        System.out.println("1- Result x2 : " + myIntegerCalculator1.calcIt(5));

        //-----------------------------------------------------------------------
        // Omitting Parameter Types, Single Parameter
        Processor stringProcessor = (str) -> str.length();
        String name = "Java Lambda";
        int length = stringProcessor.getStringLength(name);
        System.out.println(length);     //from   ww w.ja  v a 2  s .  c  om

        //-----------------------------------------------------------------------
        // final modifier
        Processor stringProcessor1 = (final String str) -> str.length();
        String name1 = "Java Lambda";
        int length1 = stringProcessor1.getStringLength(name1);
        System.out.println(length1);/* w w  w . ja  v  a  2s .co m*/

        //-----------------------------------------------------------------------
        //No Parameters
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());

        int x = 0, y= 1;
        bs = () -> x > y;
        System.out.println(bs.getAsBoolean());

    }

}

