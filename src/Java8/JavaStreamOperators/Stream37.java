package Java8.JavaStreamOperators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream37 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> list = new ArrayList<>(){
            {
                for (int i=0; i<10; i++)
                    add(r.nextInt(10));
            }
        };

        //----------------------------------------------------
        // Stream creation ve Terminal operation yalniz 1 kez kullanilabilir
        // intermediate operation loop gibi calisiyor
        System.out.print("list : ");
        System.out.println(list);
        Set<Integer> arrayKare = list
                .stream()                               // Stream creation
                .peek(x -> System.out.print(x + "-"))   // Intermediate operation
                .map(x -> x*x)                          // Intermediate operation
                .peek(x -> System.out.print(x + " "))   // Intermediate operation
                .collect(Collectors.toSet());           // Terminal operation

        System.out.print("kare array : " );
        System.out.println(arrayKare);

        //----------------------------------------------------
        int even = list
                .stream()
                .filter(x -> x%2 == 0)
                .reduce(0, (val,i) -> val+i);

        System.out.println("cift olanlari topla: " + even);

        //----- yukaridaki islem ile asagidaki ayni -----------
        Integer acc = 0;
        for (Integer x : list) {
            if (x % 2 == 0) {
                acc = acc + x;
            }
        }
        int even1 = acc;


        //----------------------------------------------------
        Integer[] numbers = {1, 2, 3};
        Integer reduce = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce : " + reduce);

        //----------------------------------------------------
        Integer reduce1 = list.stream()
                .reduce(0, (a, b) -> {
                    if (b%2 == 0)
                        return a * b;
                    else
                        return a + b;
                });
        System.out.println("reduce1 : " + reduce1);

        //----------------------------------------------------
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());


    }


}
