package Java8.JavaMethodReference;



@FunctionalInterface
interface MyInterface1{
    Hello display1(String say);
}

class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}

// Method reference to a constructor
public class MethodReference05 {

    public static void main(String[] args) {
        //Method reference to a constructor
        MyInterface1 ref = Hello::new;
        ref.display1("Hello World!");
    }
}
