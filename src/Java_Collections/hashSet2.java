package Java_Collections;

import java.util.*;

public class hashSet2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,8,3,6,5,9));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,8,3,6,5,9));

        System.out.println(list1.add(2));
        System.out.println(set1.add(2));
        System.out.println(list1);
        System.out.println(set1);

        Iterator iter = set1.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());

    }
}
