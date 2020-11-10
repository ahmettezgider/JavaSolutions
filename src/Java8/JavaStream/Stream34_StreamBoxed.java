package Java8.JavaStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class Stream34_StreamBoxed {
    public static void main(String[] args) {
        //It works perfect !!
        List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());


        /*  Compilation Error !!
            IntStream.of(1,2,3,4,5)
                .collect(Collectors.toList());

            To convert a stream of primitives, you must first box the elements in
            their wrapper class and then collect them. This type of stream in called boxed stream.
         */


        //--------------------------------------------------------------------
        //IntStream – stream of ints
        //Get the collection and later convert to stream to process elements
        List<Integer> ints = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints);       // [1, 2, 3, 4, 5]

        //Stream operations directly
        Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed()
                .max(Integer::compareTo);

        System.out.println(max);        // 5




        //--------------------------------------------------------------------
        //LongStream – stream of longs
        List<Long> longs = LongStream.of(1l,2l,3l,4l,5l)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(longs);      // [1, 2, 3, 4, 5]



        //--------------------------------------------------------------------
        //DoubleStream – stream of doubles
        List<Double> doubles = DoubleStream.of(1d,2d,3d,4d,5d)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(doubles);    // [1.0, 2.0, 3.0, 4.0, 5.0]

    }
}
