package Java8.JavaFunctionalInterface;

public class GenericFunctionalInterface {
}
/*
Generic Functional Interface
We can use type parameters with a functional interface to create generic functional interface.

The following code creates a generic functional parameter function interface with one type parameter T.

@FunctionalInterface
public interface  Comparator<T> {
    int compare(T o1, T o2);
}
The following code defines a non-generic functional interface with an abstract generic method:

@FunctionalInterface
public interface  Processor {
   <T> void  process(T[] list);
}
 */
