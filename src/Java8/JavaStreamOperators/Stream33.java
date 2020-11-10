package Java8.JavaStreamOperators;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream33 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(){
            {
                for (int i = 0; i < 20; i++) {
                    add((int)(Math.random()*30));
                }
            }
        };


        //--------------------------------------------------------------
        //  filter, toArray
        Integer[] nums = list
                .stream()
                .filter(n -> n % 2 == 1)
                .toArray(Integer[]::new);

        //--------------------------------------------------------------
        //  map, toArray
        String lines = "I Love Java 8 Stream!";
        String[] result1 = Arrays.stream(lines.trim().split("\\s+"))
                .map(String::toUpperCase)
                .toArray(String[]::new);

        System.out.println(Arrays.asList(result1));

        //--------------------------------------------------------------
        //  map, boxed, toArray
        int[] num = {1, 2, 3, 4, 5};
        Integer[] result2 = Arrays.stream(num)
                .map(x -> x * 2)
                .boxed()
                .toArray(Integer[]::new);

        System.out.println(Arrays.asList(result2));


        //--------------------------------------------------------------
        //  arngeClosed, toArray
        int[] stream1 = IntStream
                .rangeClosed(1, 5)
                .toArray();
        System.out.println(Arrays.toString(stream1));

        //--------------------------------------------------------------
        //  mapToInt, toArray
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        int[] result = stream2
                .mapToInt(x -> x)
                .toArray();

        System.out.println(Arrays.toString(result));

    }
}
