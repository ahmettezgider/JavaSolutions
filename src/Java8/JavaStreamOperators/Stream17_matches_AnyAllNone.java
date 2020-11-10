package Java8.JavaStreamOperators;

import java.util.stream.Stream;

public class Stream17_matches_AnyAllNone {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Java Stream anyMatch() example
        Stream<String> stream1 = Stream.of("one", "two", "three", "four");

        boolean match1 = stream1.anyMatch(s -> s.contains("four"));

        System.out.println(match1);      //true


        //--------------------------------------------------------------
        //Stream allMatch() example
        Stream<String> stream2 = Stream.of("one", "two", "three", "four");

        boolean match2 = stream2.allMatch(s -> s.contains("\\d+") == false );

        System.out.println(match2);      //true


        //--------------------------------------------------------------
        //Stream noneMatch() example
        Stream<String> stream3 = Stream.of("one", "two", "three", "four");

        boolean match3 = stream3.noneMatch( s -> s.contains("\\d+") );

        System.out.println(match3);  //true



    }
}

/*
1. Stream anyMatch() method
    1.1. Syntax
    Method syntax
    boolean anyMatch(Predicate<? super T> predicate)
    Here predicate a non-interfering, stateless predicate to apply to elements of the stream.

    1.2. Description
    It is a short-circuiting terminal operation.
    It returns whether any elements of this stream match the provided predicate.
    May not evaluate the predicate on all elements if not necessary for determining the result.
    Method returns true as soon as first matching element is encountered.
    If the stream is empty then false is returned and the predicate is not evaluated.

    Difference between anyMatch() vs contains()
    Theoretically, there is no difference between anyMatch() and contains()
    when we want to check if an element exist in a list.



    1. Stream allMatch() method
    1.1. Syntax
    Method syntax
    boolean allMatch(Predicate<? super T> predicate)
    Here predicate a non-interfering, stateless predicate to apply to elements of the stream.

    1.2. Description
    It is a short-circuiting terminal operation.
    It returns whether all elements of this stream match the provided predicate.
    May not evaluate the predicate on all elements if not necessary for determining the result.
    Method returns true if all stream elements match the given predicate, else method returns false.
    If the stream is empty then true is returned and the predicate is not evaluated.



    1. Stream noneMatch() method
    1.1. Syntax
    Method syntax
    boolean noneMatch(Predicate<? super T> predicate)
    Here predicate a non-interfering, stateless predicate to apply to elements of the stream.

    1.2. Description
    It is a short-circuiting terminal operation.
    It returns whether no element of the stream match the provided predicate.
    May not evaluate the predicate on all elements if not necessary for determining the result.
    Method returns true if no stream element match the given predicate, else method returns false.
    If the stream is empty then true is returned and the predicate is not evaluated.
    It is pretty much opposite to method Stream.allMatch().





 */

