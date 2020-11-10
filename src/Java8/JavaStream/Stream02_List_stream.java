package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream02_List_stream {

    public static void main(String[] args) {
        // List.stream()
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

    }

}
