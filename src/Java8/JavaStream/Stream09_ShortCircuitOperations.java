package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;

public class Stream09_ShortCircuitOperations {

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

        // Stream.anyMatch()
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matched);

        //  Stream.findFirst()
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst().get();

        System.out.println(firstMatchedName);

        //



    }
}
