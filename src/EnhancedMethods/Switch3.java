package EnhancedMethods;

import java.util.Random;

public class Switch3 {
    public static void main(String[] args) {
        int val = new Random().nextInt(10);

        //--------------------------------------------------
        switch (val) {
            case 1, 2, 3:
                System.out.println("sayi 1 2 3");
                break;
            case 4, 5, 6:
                System.out.println("sayi 4 5 6");
                break;
            default:
                System.out.println("sayi 7 8 9 0");
        }

        //--------------------------------------------------
        // -> kullaniminda break; kullaimi compile hatasi verir
        switch (val) {
            case 1, 2, 3 -> System.out.println("sayi 1 2 3");
            case 4, 5, 6 -> System.out.println("sayi 4 5 6");
            default -> System.out.println("sayi 7 8 9 0");
        }


    }
}
