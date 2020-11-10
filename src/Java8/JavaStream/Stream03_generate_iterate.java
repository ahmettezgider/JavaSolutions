package Java8.JavaStream;

import java.util.Date;
import java.util.stream.Stream;

public class Stream03_generate_iterate {

    public static void main(String[] args) {
        // Stream.generate()
        //Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        Stream.generate(() -> { return new Date(); })
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        Stream.generate(Date::new)
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        // Stream.iterate()
        Stream.iterate(0, x -> x+2)
                .limit(10).forEach(p -> System.out.print(p + " "));

    }

}
