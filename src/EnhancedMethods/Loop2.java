package EnhancedMethods;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Loop2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

        for (ListIterator iter = list.listIterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}

// 1 - can call methods of element
// 2 - can use iter.remove() to remove the current element from the list
// 3 - can use iter.add(...) to insert a new element into the list
//     between element and iter->next()
// 4 - can use iter.set(...) to replace the current element

// ...
