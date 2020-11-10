package Java8.JavaForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEach04_Biconsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer> action = (a, b) ->
        {
            System.out.println("Key is : " + a);
            System.out.println("Value is : " + b);
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.forEach(action);
    }
}
