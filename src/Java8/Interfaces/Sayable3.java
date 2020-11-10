package Java8.Interfaces;

public interface Sayable3{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);

    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}