package Java8.JavaLambda;

// Java Lambda Expression Example
//Now, we are going to implement the above example with the help of Java lambda expression.


import Java8.Interfaces.Drawable;

public class Lambda2 {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=() -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
