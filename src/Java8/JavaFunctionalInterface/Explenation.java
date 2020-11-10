package Java8.JavaFunctionalInterface;

public class Explenation {
}
/*
https://mkyong.com/tutorials/java-8-tutorials/


1. Functional Interface
Java 8 introduced @FunctionalInterface, an interface that has exactly one abstract method.
The compiler will treat any interfaces meeting the definition of a functional interface
as a functional interface; it means the @FunctionalInterface annotation is optional.

Let us see the six basic function interfaces.

Interface	        Signature	            Examples
-----------------   ---------------------   --------------------------------------
UnaryOperator<T>	T apply(T t)	        String::toLowerCase, Math::tan

BinaryOperator<T>   T apply(T t1, T t2)	    BigInteger::add, Math::pow

Function<T, R>	    R apply(T t)	        Arrays::asList, Integer::toBinaryString

Predicate<T, U>	    boolean test(T t, U u)  String::isEmpty, Character::isDigit

Supplier<T>	        T get()	                LocalDate::now, Instant::now

Consumer<T>	        void accept(T t)	    System.out::println, Error::printStackTrace

 */