package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream04_distinct {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Find All Distinct Elements
        Collection<String> list1 = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        // Get collection without duplicate i.e. distinct only
        List<String> distinctElements1 =
                list1.stream()
                        .distinct()
                        .collect(Collectors.toList());

        //Let's verify distinct elements
        System.out.println(distinctElements1);



        //--------------------------------------------------------------
        //Find distinct objects by object key or attribute
        //distinctByKey Example
        Person lokesh = new Person(1, "Lokesh", "Gupta");
        Person brian = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");

        //Add some random persons
        Collection<Person> list2 = Arrays.asList(lokesh,brian,alex,lokesh,brian,lokesh);

        // Get distinct objects by key
        List<Person> distinctElements2 = list2.stream()
                .filter( distinctByKey(p -> p.getId()) )
                .collect( Collectors.toList() );

        // Let's verify distinct elements
        System.out.println( distinctElements2 );


    }


    //Utility function
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
