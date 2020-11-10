package Java8.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream20_IntStream {

    public static void main(String[] args) {

        IntStream.of(10);       //10        IntStream of(int t)
        IntStream.of(1, 2, 3);  //1,2,3     IntStream of(int... values)

        //--------------------------------------------------------
        // IntStream.range() and IntStream.rangeClosed()
        IntStream.range(1, 5);      //1,2,3,4,5


        //--------------------------------------------------------
        // IntStream.iterate()
        IntStream.iterate(0, i -> i + 2).limit(10); //0,2,4,6,8,10,12,14,16,18


        //--------------------------------------------------------
        //IntStream.generate()
        IntStream stream1 = IntStream.generate(()
                -> { return (int)(Math.random() * 10000); });

        stream1.limit(10).forEach(System.out::println);


        //--------------------------------------------------------
        //Foreach loop, Bu clasa ait doSomething() methodu var

        IntStream.rangeClosed(0, 4)
                .forEach( Stream20_IntStream::doSomething );


        //--------------------------------------------------------
        //IntStream range and closed range

        //Range
        IntStream stream2 = IntStream.range(5, 10);
        stream2.forEach( System.out::println );  //5,6,7,8,9

        //Closed Range
        IntStream closedRangeStream = IntStream.rangeClosed(5, 10);
        closedRangeStream.forEach( System.out::println );   //5,6,7,8,9,10


        //--------------------------------------------------------
        //Filter operation, Bu clasa ait isPrime() methodu var
        IntStream stream = IntStream.range(1, 100);

        List<Integer> primes = stream.filter(Stream20_IntStream::isPrime)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(primes);


        //--------------------------------------------------------
        //IntStream to array
        int[] intArray = IntStream.of(1, 2, 3, 4, 5).toArray();

        System.out.println(Arrays.toString(intArray));      // [1, 2, 3, 4, 5]


        //--------------------------------------------------------
        //IntStream to list
        List<Integer> ints = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints);           // [1, 2, 3, 4, 5]



    }

    private static void doSomething(int i) {
        System.out.println(i);
    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}
