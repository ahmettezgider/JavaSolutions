package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream06_StreamToArray {

    public static void main(String[] args) {

        // Convert Stream to array – Stream.toArray( EntryType[]::new )
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
        

    }

}
