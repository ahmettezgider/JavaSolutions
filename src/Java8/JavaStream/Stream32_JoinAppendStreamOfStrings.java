package Java8.JavaStream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream32_JoinAppendStreamOfStrings {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        /*Collectors.joining() method
            - joining() – the input elements are concatenated into a String, in encounter order.
            - joining(CharSequence delimiter) – the input elements are concatenated into a String,
                separated by the specified delimiter, in encounter order.
            - joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix) – –
                the input elements are concatenated into a String, separated by the specified delimiter,
                with the specified prefix and suffix, in encounter order..

         */




        //--------------------------------------------------------------------
        // Join stream of strings – example
        Stream<String> words = Arrays.asList("A", "B", "C", "D").stream();

        String joinedString = words.collect(Collectors.joining());      //ABCD

        System.out.println( joinedString );

        joinedString = words.collect(Collectors.joining(","));      //A,B,C,D

        System.out.println( joinedString );

        joinedString = words.collect(Collectors.joining(",", "{", "}"));    //{A,B,C,D}

        System.out.println( joinedString );



    }
}
