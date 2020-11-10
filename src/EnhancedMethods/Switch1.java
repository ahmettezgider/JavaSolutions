package EnhancedMethods;

import java.util.Random;
import java.util.function.Function;

public class Switch1 {
    public static void main(String[] args) {

        int val = new Random().nextInt(10);

        //----------------------------------------------------------
        // yield kullaniminda break; compile hatasi verir. -> sembolü kullanilmaz
        String message = switch (val) {
            case 0:
            case 1:
            case 2:
            case 3:
                yield val + ", 4 den kücüktür.";
            case 4:
            case 5:
            case 6:
                yield val + ", 7 den kücüktür.";
            default:
                throw new RuntimeException("Beklenmedik deger : " + val);
        };
        System.out.println(message);

        //----------------------------------------------------------
        int a = switch (val){
            case 0, 1, 2, 3:
                yield 0;
            default:
                yield 1;
        };
        System.out.println(a);

    }

}