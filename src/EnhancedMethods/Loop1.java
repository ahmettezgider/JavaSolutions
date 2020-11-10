package EnhancedMethods;

import java.util.*;

public class Loop1 {
    public static void main(String[] argv) {

        List<String> crunchifyList = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

        // Simple For loop
        for (int i = 0; i < crunchifyList.size(); i++) {
            System.out.println(crunchifyList.get(i));
        }

        // New Enhanced For loop
        for (String temp : crunchifyList) {
            System.out.println(temp);
        }

        // Iterator - Returns an iterator over the elements in this list in proper sequence.
        Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }

        // ListIterator - traverse a list of elements in either forward or backward order
        // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
        // and obtain the iterator's current position in the list.
        ListIterator<String> crunchifyListIterator = crunchifyList.listIterator();
        while (crunchifyListIterator.hasNext()) {
            System.out.println(crunchifyListIterator.next());
        }

        // while loop
        int i = 0;
        while (i < crunchifyList.size()) {
            System.out.println(crunchifyList.get(i));
            i++;
        }

        // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
        crunchifyList.forEach((temp) -> {
            System.out.println(temp);
        });

        // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
        crunchifyList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));
    }
}
