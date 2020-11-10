package Java_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String... args) {

        Map<String, List<Integer>> map1 = new HashMap<>(){
            {
                put("a", new ArrayList<>(List.of(1, 2, 3, 4)));
                put("b", new ArrayList<>(List.of(5)));
                put("c", new ArrayList<>(List.of(1,2)));
            }
        };

        Map<String, List<Integer>> map2 = Map.of("c", List.of(10, 11));

        // map1 i map3 e merge et
        Map<String, List<Integer>> map3 = new HashMap<>();
        map1.forEach(
                (k, v) -> map3.merge(k, v, (v1, v2) -> v2)
        );

        // map2 yi map3 e merge et
        map2.forEach(
                (k, v) -> map3.merge(k, v, (v1, v2) -> v2)
        );

        System.out.println(map3);


        List<Map<String, List<Integer>>> maps = new ArrayList<>();

        maps.add(map2);

        maps.forEach(map ->
                map.forEach(
                        (k, v) -> map1.merge(k, v, (l1, l2) -> {l1.addAll(l2); return l1;})
                )
        );

        map1.entrySet().forEach(System.out::println);



    }

}
