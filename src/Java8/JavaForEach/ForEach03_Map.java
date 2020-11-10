package Java8.JavaForEach;

import java.util.HashMap;
import java.util.Map;


public class ForEach03_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "Charles");

        map.forEach((k, v) ->
                System.out.println("Key = " + k + ", Value = " + v));
    }


    /*
    void forEach(BiConsumer<? super K, ? super V> action) {
        Objects.requireNonNull(action);
        for (Map.Entry<K, V> entry : entrySet()) {
            K k;
            V v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch(IllegalStateException ise) {
                // this usually means the entry is no longer in the map.
                throw new ConcurrentModificationException(ise);
            }
            action.accept(k, v);
        }
    }
    */

}
