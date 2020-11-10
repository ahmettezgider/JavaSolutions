package Java8.JavaStream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        //-------------------------------------------------------------------
        System.out.println("Reverse number - Normal method");
        int number = 123;
        int reversedNumber = 0;
        while (number > 0){
            reversedNumber = 10 * reversedNumber + (number%10);
            number /= 10;
        }
        System.out.println(reversedNumber);

        //-------------------------------------------------------------------
        System.out.println("Reverse number - Stream method");
        number = 123;
        Arrays.stream(((number+"").split("")))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

        System.out.println();
        System.out.println("Reverse number - Stream method");
        String str = Arrays.stream(((number+"").split("")))
                .sorted(Comparator.reverseOrder())
                .reduce("", (x,y) -> x+y);
        
        System.out.println(str);

        //-------------------------------------------------------------------
        // Reverse numbers stream, function
        System.out.println("Reverse numbers stream, function");
        Function<Integer, String> reverseNumber;
        reverseNumber = (num) -> {
            String numStr = num+"";
            int revNum=0;
            while (num > 0){
                revNum = 10 * revNum + (num%10);
                num /= 10;
            }
            String revNumStr = revNum+"";
            int j = numStr.length()-revNumStr.length();
            for (int i=0; i<j; i++)
                revNumStr = "0".concat(revNumStr);
            return  revNumStr;
        };
        Stream.generate(()->1000 + new Random().nextInt(1000))
                .peek(n -> System.out.print(n + "-"))
                .limit(5)
                .map(reverseNumber)
                .forEach(n -> System.out.print(n + " "));

        //-------------------------------------------------------------------
        System.out.println();
        System.out.println("Prime Numbers - Stream method");
        Predicate<Integer> isPrime = n -> {
            for (int i=2; i<=n/2;i++)
                if (n % i == 0) return false;
            return true;
        };
        Stream.iterate(2,  x->x+1)
                .limit(100)
                .filter(isPrime)
                .forEach(n -> System.out.print(n + " "));

        boolean b = Stream.iterate(2,  x->x+1)
                .limit(100)
                .filter(isPrime)
                .allMatch(isPrime);
        System.out.println(b);

        //-------------------------------------------------------------------
        System.out.println("Prime Numbers - Stream method");
        Stream.iterate(2,  x->x+1)
                .limit(100)
                .filter(n -> {
                    for (int i=2; i<=n/2;i++)
                        if (n % i == 0) return false;
                    return true;
                })
                .forEach(n -> System.out.print(n + " "));


        //-------------------------------------------------------------------
        // BiFunction ve Consumer
        System.out.println();
        System.out.println("BiFunction ve Consumer");

        BiFunction<Integer, Integer, Integer> biFunction;
        biFunction = (x, y) -> {
            return new Random().nextInt(y-x) + x;
        };

        Consumer<Integer> consumer;
        consumer = (n) -> {
            while(n>0) {
                System.out.print(n + " ");
                n /=2;
            }
        };

        consumer.accept(biFunction.apply(10,30));

        //-------------------------------------------------------------------
        //
        System.out.println();
        Optional<Integer> num2 = Stream.iterate(0, x->new Random()
                .nextInt(50))
                .limit(10)
                .reduce(Math::max);
        System.out.println(num2);

        //-------------------------------------------------------------------
        //
        System.out.println("Stream generate random numbers");
        Stream.generate(()->new Random().nextInt(100))
                .limit(20)
                .sorted()
                //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(n -> System.out.print(n + " "));

        //-------------------------------------------------------------------
        //
        /*
        Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
        Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randomUUIDSupplier);
        List<UUID> randomInts = infiniteStreamOfRandomUUID
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(randomInts);

         */
        System.out.println("Random ints");
        //Supplier<Integer> randomNumbersSupplier = new Random():: nextInt;
        Supplier<Integer> randomNumbersSupplier =
                () ->  new Random().nextInt(100);

        Stream<Integer> randomNumbers = Stream.generate(randomNumbersSupplier);
        //Stream<Integer> randomNumbers = Stream.generate(() ->  new Random().nextInt(100));

        List<Integer> randomNumbersList = randomNumbers
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(randomNumbersList);


    }

}
