package Java8.JavaMethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference01 {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Method reference to static method – Class::staticMethodName
        List<Integer> integers1 = Arrays.asList(1, 12, 433, 5);

        Optional<Integer> max1 = integers1.stream().reduce( Math::max );

        max1.ifPresent(value -> System.out.println(value));      // 433



        //--------------------------------------------------------------
        //Method reference to instance method from instance – ClassInstance::instanceMethodName
        List<Integer> integers2 = Arrays.asList(1,12,433,5);

        Optional<Integer> max2 = integers2.stream().reduce( Math::max );

        max2.ifPresent( System.out::println );  // 433


        //--------------------------------------------------------------
        //Method reference to instance method from class type – Class::instanceMethodName
        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sorted);     // [com, do, dot, how, in, java, to]

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);     // [com, do, dot, how, in, java, to]



        //--------------------------------------------------------------
        //Reference to constructor – Class::new
        List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));

        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(System.out::println);     // 99


    }
}

/*

1. Types of method references
Java 8 allows four types of method references.

METHOD REFERENCE	DESCRIPTION	METHOD REFERENCE EXAMPLE
Reference to static method
Used to refer static methods from a class
Math::max equivalent to Math.max(x,y)


Reference to instance method from instance
Refer to an instance method using a reference to the supplied object
System.out::println equivalent to System.out.println(x)


Reference to instance method from class type
Invoke the instance method on a reference to an object supplied by the context
String::length equivalent to str.length()


Reference to constructor
Reference to a constructor
ArrayList::new equivalent to new ArrayList()
 */