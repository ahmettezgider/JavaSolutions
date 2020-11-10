package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream05_StreamCollect {

    public static void main(String[] args) {

        // Convert Stream to List – Stream.collect( Collectors.toList() )
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        System.out.print(evenNumbersList);

    }

}
