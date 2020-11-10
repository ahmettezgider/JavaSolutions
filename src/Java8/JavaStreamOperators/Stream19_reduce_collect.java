package Java8.JavaStreamOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream19_reduce_collect {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");


        //--------------------------------------------------------------
        //Stream.reduce()
        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "-" + s2);

        reduced.ifPresent(System.out::println); //Amitabh-Shekhar-Aman-Rahul-Shahrukh-Salman-Yana-Lokesh



        //--------------------------------------------------------------
        //
        List<Integer> integers = Arrays.asList(1, 12, 433, 5);

        Optional<Integer> max = integers
                .stream()
                .reduce( Math::max );

        max.ifPresent(value -> System.out.println(value));      //433


        //--------------------------------------------------------------
        //Stream.collect()
        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
        //[AMAN, AMITABH, LOKESH, RAHUL, SALMAN, SHAHRUKH, SHEKHAR, YANA]
    }
}
