package Java8.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream21_IntStreamToCollection {
    public static void main(String[] args) {

        //It works perfect !!
        List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());

        //Compilation Error !!
        //IntStream.of(1,2,3,4,5).collect(Collectors.toList());

        //--------------------------------------------------------
        //IntStream to collection – boxed streams
        List<Integer> ints1 = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints1);       // [1, 2, 3, 4, 5]



        //--------------------------------------------------------
        //IntStream to list – map int to Integer
        List<Integer> ints2 = IntStream.of(1,2,3,4,5)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(ints2);       // [1, 2, 3, 4, 5]




        //--------------------------------------------------------
        //Convert IntStream to array
        int[] intArray = IntStream.of(1, 2, 3, 4, 5).toArray();

        System.out.println(Arrays.toString(intArray));      // [1, 2, 3, 4, 5]



        //--------------------------------------------------------
        //


        //--------------------------------------------------------
        //

    }
}
