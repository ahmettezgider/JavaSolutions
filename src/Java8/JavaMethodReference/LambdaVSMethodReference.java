package Java8.JavaMethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaVSMethodReference {
    public static void main(String[] args) {

        /*
            public interface Iterable<T> {

                default void forEach(Consumer<? super T> action) {
                    Objects.requireNonNull(action);
                    for (T t : this) {
                        action.accept(t);
                    }
                }
                //...
            }



            Lambda expression.

            // arg0 is the first argument
            Lambda expression: (arg0, rest_of_args) -> arg0.methodName(rest_of_args)
            Method Reference : arg0_Type::methodName

            // example, assume a and b are String
            Lambda expression: (a, b) -> a.compareToIgnoreCase(b)
            Method Reference : ClassName::methodName
            Method Reference : String::compareToIgnoreCase

         */

        //--------------------------------------------------------------
        //First, we can provide an anonymous class as the forEach implementation.

        List<String> list1 = Arrays.asList("node", "java", "python", "ruby");
        list1.forEach(new Consumer<String>() {       // anonymous class
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });



        //--------------------------------------------------------------
        //Alternatively, we can use a lambda expression to shorten the code like this:
        List<String> list2 = Arrays.asList("node", "java", "python", "ruby");
        list2.forEach(str -> System.out.println(str)); // lambda expressions


        //--------------------------------------------------------------
        //To gain better readability, we can replace lambda expression with method reference.
        List<String> list3 = Arrays.asList("node", "java", "python", "ruby");
        list3.forEach(System.out::println);           // method references
    }
}
