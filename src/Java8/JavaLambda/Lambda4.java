package Java8.JavaLambda;

// Java Lambda Expression Example: Single Parameter


import Java8.Interfaces.Sayable;

public class Lambda4 {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}