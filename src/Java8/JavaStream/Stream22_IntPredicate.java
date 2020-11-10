package Java8.JavaStream;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream22_IntPredicate {
    public static void main(String[] args) {

        // IntPredicate
        IntPredicate isOdd = argument -> argument % 2 == 1;

        //1. Use predicate directly
        System.out.println( isOdd.test(9) );    //true
        System.out.println( isOdd.test(10) );   //false

        //2. Use predicate in filters
        IntStream stream1 = IntStream.range(1, 10);

        List<Integer> oddNumbers = stream1.filter(isOdd)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(oddNumbers);     // [1, 3, 5, 7, 9]

        //--------------------------------------------------------------
        // Complex IntPredicate
        //IntPredicate isOdd = argument -> argument % 2 == 1;

        IntStream stream2 = IntStream.range(1, 20);

        List<Integer> oddPrimes = stream2.filter( isOdd.and(Stream22_IntPredicate::isPrime) )
                .boxed()
                .collect(Collectors.toList());

        System.out.println(oddPrimes);      // [3, 5, 7, 11, 13, 17, 19]




    }


    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}
