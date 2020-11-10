package Java8.JavaLambda;

// Without Lambda Expression


import Java8.Interfaces.Drawable;

public class Lambda1 {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable(){
            public void draw(){System.out.println("Drawing "+width);}
        };

        d.draw();
    }
}
/*
Java Lambda Expression Syntax

(argument-list) -> {body}

Java lambda expression is consisted of three components.
1) Argument-list: It can be empty or non-empty as well.
2) Arrow-token: It is used to link arguments-list and body of expression.
3) Body: It contains expressions and statements for lambda expression.

No Parameter Syntax
() -> {
    //Body of no parameter lambda
}

One Parameter Syntax
(p1) -> {
    //Body of single parameter lambda
}

Two Parameter Syntax
(p1,p2) -> {
    //Body of multiple parameter lambda
}


 */