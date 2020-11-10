package Java8.JavaLambda;

// Java Lambda Expression Example: No Parameter


import Java8.Interfaces.Sayable1;

public class Lambda3 {
    public static void main(String[] args) {
        Sayable1 s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}