package Java8.JavaStream;

import java.util.stream.Stream;

public class Stream01_StreamOf {

    public static void main(String[] args) {

        //--------------------------------------------------------------------
        // Stream.of(val1, val2, val3….)
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        stream1.forEach(p -> System.out.println(p));

        //--------------------------------------------------------------------
        // Stream.of(arrayOfElements)
        Stream<Integer> stream2 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream2.forEach(p -> System.out.println(p));


    }

}
