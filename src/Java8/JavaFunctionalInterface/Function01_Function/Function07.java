package Java8.JavaFunctionalInterface.Function01_Function;

import java.util.function.Function;

public class Function07 {
    public static void main(String[] args) {
        //----------------------------------------------------------
        Function<Integer, Double> power = n -> (double)n*n;
        System.out.println(power.apply(7));

        //----------------------------------------------------------
        Function<Integer, Double> function = n -> {
            double d;
            switch (n){
                case 1,2,3,4,5 -> d = (double) n*n;
                default -> d = (double) 10*n;
            }
            return d;
        };
        Double conc = calc(function, (int)(Math.random()*10));

        System.out.println(conc);
    }

    public static Double calc(Function<Integer, Double> function, Integer i){
        return function.apply(i);
    }
}
