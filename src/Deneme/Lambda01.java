package Deneme;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda01 {

    //-------------------------------------------------------------
    static void print (String text) {
        System.out.println("Text is: " + text);
    }

    //-------------------------------------------------------------
    static void print (Supplier<String> text) {
        System.out.println(text.get());
    }


    public static void main(String[] args) {

        print(() -> "Hello");
        print(() -> "World!");

        // This consumer calls a void counter with the value.
        Consumer<String> consumer1 = a -> print ("Consumer-1 " + a);

        // This consumer calls a void counter with the value.
        Consumer<String> consumer2 = b -> print ("Consumer-2 " + b);

        //Consumer-1
        consumer1.accept("Hi, I am consumer-1!");

        //Consumer-1 and then Consumer-2
        consumer1.andThen(consumer2).accept("Common text for consumers!");
    }

}
