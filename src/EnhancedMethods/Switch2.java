package EnhancedMethods;

import java.util.Random;

public class Switch2 {
    public static void main(String[] args) {
        int val = new Random().nextInt(10);
        int price;

        // -> sembolü kullaniminda break; kullanimi compile hatasi verir
        switch (val) {
            case 0 -> price = 10_000;
            case 1 -> price = 20_000;
            case 2 -> price = 30_000;
            case 3 -> price = 40_000;
            default -> price = switch (new Random().nextInt(10)){
                case 0,1,2,3 -> 50_000;
                case 4,5,6,7 -> 60_000;
                default -> 70_000;
            };
        }
        System.out.println(price);
    }
}
