package Java8.JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream10_Parallelism {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }
}

/*
To enable parallelism, all you have to do is to create a parallel stream,
instead of a sequential stream. And to surprise you, this is really very easy.
In any of the above-listed stream examples, anytime you want to
particular job using multiple threads in parallel cores, all you have to
call method parallelStream() method instead of stream() method.
 */