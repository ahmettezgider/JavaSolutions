package Java8.JavaLambda;

import Java8.Interfaces.Algebra;
import Java8.Interfaces.CustomArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLambda {
    public static void main(String[] args) {
        /*
        Functional Interface
        Lambda expression provides implementation of functional interface.
        An interface which has only one abstract method is called functional interface.
        Java provides an anotation @FunctionalInterface, which is used to declare
        an interface as functional interface.

        Why use Lambda Expression
            To provide the implementation of Functional interface.
            Less coding.

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

        ###################################################################
        class A {
            public void foo() {
                List<String> list = ...
                list.forEach( s -> { System.out.println(s); } );
            }
        }

        ###################################################################
        class A {
            public void foo() {
                List<String> list = ...
                list.forEach( [lambda for lambda$1 as Block] );
            }

            static void lambda$1(String s) {
                System.out.println(s);
            }
        }

        ###################################################################
        class B {
            public void foo() {
                List<Person> list = ...
                final int bottom = ..., top = ...;
                list.removeIf( p -> (p.size >= bottom && p.size <= top) );
            }
        }

        ###################################################################
        class B {
            public void foo() {
                List<Person> list = ...
                final int bottom = ..., top = ...;
                list.removeIf( [ lambda for lambda$1 as Predicate capturing (bottom, top) ]);
            }

            static boolean lambda$1(int bottom, int top, Person p) {
                return (p.size >= bottom && p.size <= top;
            }
        }



         */

        new Thread(
                () ->   {
                    System.out.println("My Runnable");
                }
        ).start();


        new Thread(
                () ->   {
                    System.out.println("My Runnable");
                }
        ).start();

        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");

        pointList.forEach(p ->  {
                    System.out.println(p);
                    //Do more work
                }
        );


        Employee[] employees  = {
                new Employee("David"),
                new Employee("Naveen"),
                new Employee("Alex"),
                new Employee("Richard")};

        System.out.println("Before Sorting Names: "+Arrays.toString(employees));
        Arrays.sort(employees, Employee::nameCompare);
        System.out.println("After Sorting Names "+Arrays.toString(employees));




        //////////////////////////////////////////////
        Algebra alg[] = new Algebra[] {
                (a, b) -> a+b,
                (a, b) -> a-b,
                (a, b) -> a*b,
                (a, b) -> a/b
        };
        System.out.println("The addition of a and b is: " + alg[0].operate(30, 20));
        System.out.println("The subtraction of a and b is: " + alg[1].operate(30, 20));
        System.out.println("The multiplication of a and b is: " + alg[2].operate(30, 20));
        System.out.println("The division of a and b is: " + alg[3].operate(30, 20));

        // Initilaize an array in Lambda Expression
        CustomArray<String>[] strArray = new CustomArray[] {
                () -> "Adithya",
                () -> "Jai",
                () -> "Raja",
                () -> "Surya"
        };
        System.out.println(strArray[0].arrayValue());
        System.out.println(strArray[1].arrayValue());
        System.out.println(strArray[2].arrayValue());
        System.out.println(strArray[3].arrayValue());

    }


}





