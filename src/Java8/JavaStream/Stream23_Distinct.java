package Java8.JavaStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream23_Distinct {
    public static void main(String[] args) {

        //Find all distinct elements
        Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        // Get collection without duplicate i.e. distinct only
        List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

        //Let's verify distinct elements
        System.out.println(distinctElements);       // [A, B, C, D]


        //----------------------------------------------------------------------------------
        // Find distinct objects by object key or attribute


    }
}
