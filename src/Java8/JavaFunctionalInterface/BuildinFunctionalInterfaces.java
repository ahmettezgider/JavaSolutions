package Java8.JavaFunctionalInterface;

public class BuildinFunctionalInterfaces {
}
/*
Java Buildin Functional Interfaces
Java 8 has functional interfaces in the package java.util.function.

-------------------------------------------------------------------------------------
Function
To represent a function that takes an argument of type T and returns a result of type R.

public interface Function<T,R>{
   ...
   public R apply(T t);
   ...
}

-------------------------------------------------------------------------------------
BiFunction
To represent a function that takes two arguments of types T and U, and returns a result of type R.

public interface BiFunction<T,U,R>{
   ...
   public R apply(T t, U u);
   ...
}

-------------------------------------------------------------------------------------
Predicate
To represent a boolean function that returns true or false for the specified argument.

public Predicate<T> {
   ...
   public boolean test(T  t);
   ...
}

-------------------------------------------------------------------------------------
BiPredicate
To represent a boolean function that returns true or false for the two specified arguments.

public interface BiPredicate<T,U>{
   ...
   public boolean test(T t, U u);
   ...
}

-------------------------------------------------------------------------------------
Consumer
To represent an operation that takes an argument and returns no result.

public interface Consumer<T>{
   ...
   public void accept(T t);
   ...
}

-------------------------------------------------------------------------------------
BiConsumer
To represent an operation that takes two arguments and returns no result.

public interface BiConsumer<T,U>{
   ...
   public void accept(T t, U  u);
   ...
}

-------------------------------------------------------------------------------------
Supplier
To represent a function that returns a value as of type T.

public interface Supplier<T>{
   ...
    public T get();
   ...
}

-------------------------------------------------------------------------------------
UnaryOperator
To represent a function that takes an argument and returns a result of the same type.

public interface UnaryOperator<T>{
   ...
   public T  apply(T t);
   ...
}

-------------------------------------------------------------------------------------
BinaryOperator
To represent a function that takes two arguments and returns a result of the same type.

public interface BinaryOperator<T>{
   ...
   public T apply(T t1, T t2);
   ...
}

-------------------------------------------------------------------------------------
Note 2
The above generic buildin functional interfaces are all the generic versions of more
specialized functional interfaces.

For example, IntConsumer is a specialized version of Consumer<T>.
 */