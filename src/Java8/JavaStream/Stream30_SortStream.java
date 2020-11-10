package Java8.JavaStream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream30_SortStream {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        //Sort stream of numbers
        //Ascending order
        Stream<Integer> numStream1 = Stream.of(1,3,5,4,2);

        numStream1.sorted()
                .forEach(System.out::println);



        //--------------------------------------------------------------------
        //Descending order
        Stream<Integer> numStream2 = Stream.of(1,3,5,4,2);

        numStream2.sorted( Comparator.reverseOrder() )
                .forEach(System.out::println);


        //--------------------------------------------------------------------
        //Sort stream of strings
        Stream<String> wordStream = Stream.of("A","C","E","B","D");

        wordStream.sorted()                                 //ascending
                .forEach(System.out::println);

        wordStream.sorted( Comparator.reverseOrder() )      //descending
                .forEach(System.out::println);



    }
}
