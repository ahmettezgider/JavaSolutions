package Deneme;

import java.util.Arrays;

abstract class Sekil {
    int a;
    int b;

    Sekil(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract double area();
}

public class AbstractOrnek {
    public static void main(String[] args) {

        Sekil kare = new Sekil(1,2) {
            @Override
            double area() {
                return a*b;
            }
        };

        System.out.println(kare.getClass());
        System.out.println(Arrays.toString(kare.getClass().getDeclaredFields()));
        System.out.println(kare.area());

    }
}
