package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream08_TerminalOperations {

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

        // Stream.forEach()
        memberNames.forEach(System.out::println);

        // Stream.collect()
        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);

        //Stream.match()
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        // Stream.count()
        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);

        // Stream.reduce()
        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }

}
