package Java8.JavaForEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach02_Consumer {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alex", "Brian", "Charles");

        Consumer<String> makeUpperCase = new Consumer<String>()
        {
            @Override
            public void accept(String t)
            {
                System.out.println(t.toUpperCase());
            }
        };
    }
}
