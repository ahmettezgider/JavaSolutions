package Java8.JavaStreamOperators;

import java.util.stream.Stream;

public class Stream18_findFirst_findAny {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Stream findFirst() example

        //sequential stream
        Stream.of("one", "two", "three", "four")
                .findFirst()
                .ifPresent(System.out::println);        // one

        //parallel stream
        Stream.of("one", "two", "three", "four")
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);        // one


        //--------------------------------------------------------------
        //Stream findAny() example

        //sequential stream
        Stream.of("one", "two", "three", "four")
                .findAny()
                .ifPresent(System.out::println);        // one

        //parallel stream
        Stream.of("one", "two", "three", "four")
                .parallel()
                .findAny()
                .ifPresent(System.out::println);        // three


    }
}

/*

    1. Stream findFirst() method
    1.1. Description
    Method syntax
    Optional<T> findFirst()
    This method returns an Optional describing the first element of this stream. In case of stream has :

    defined encounter order – first element in encounter order in stream.
    no encounter order – any element may be returned.
    The above theory is vaid for all sequential and parallel streams and the behavior of
    findFirst() will not change.


    2. Stream findAny() method
    2.1. Description
    Method syntax
    Optional<T> findAny()
    This method returns an Optional describing the any element of this stream. In case of stream has :

    defined encounter order – any element may be returned.
    no encounter order – any element may be returned.
    The above theory is vaid for all sequential and parallel streams and the behavior of findAny() will not change.
 */