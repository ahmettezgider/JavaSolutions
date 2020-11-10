package Java8.JavaLambda;

import Java8.Interfaces.Calculator;

public class Lambda16_AssignmentContext {

    public static void main(String[] argv) {
        Calculator iCal = (x,y)-> x + y;//from   www.j  a  v a  2s .c o  m
        System.out.println(iCal.calculate(1, 2));
    }
}


/*
Assignment Context
A lambda expression can appear to the right of the assignment operator.

 */