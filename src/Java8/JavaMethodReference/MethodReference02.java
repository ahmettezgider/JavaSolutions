package Java8.JavaMethodReference;

@FunctionalInterface
interface MyInterface{
    void display();
}



// Method reference to an instance method of an object
public class MethodReference02 {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

        MethodReference02 obj = new MethodReference02();

        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;

        // Calling the method of functional interface
        ref.display();
    }
}
