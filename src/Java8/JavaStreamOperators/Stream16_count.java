package Java8.JavaStreamOperators;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream16_count {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Java stream count list elements – Stream count() function
        long count1 = Stream.of("how","to","do","in","java").count();
        System.out.printf("There are %d elements in the stream %n", count1);

        count1 = IntStream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.printf("There are %d elements in the stream %n", count1);

        count1 = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
        System.out.printf("There are %d elements in the stream %n", count1);


        //--------------------------------------------------------------
        //Java stream count list elements – Collectors counting() function
        long count2 = Stream.of("how","to","do","in","java").collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count2);

        count2 = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count2);

        count2 = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", count2);


    }
}
