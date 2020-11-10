package Java8;

import java.io.*;
import java.util.Scanner;

public class TryWithResouces {
    public static void main(String[] args) {

        TryNormal();
        System.out.println("----------------------");
        TryWithResources();
        System.out.println("----------------------");
        TryWithMultiResources();

    }
    //--------------------------------------------------------------
    // Try  normal usage
    static void TryNormal(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("d:/test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    //--------------------------------------------------------------
    // Try with Resources usage
    static void TryWithResources(){
        try (Scanner scanner = new Scanner(new File("d:/test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //--------------------------------------------------------------
    // Try with Multi Resources usage
    static void TryWithMultiResources(){
        try(FileInputStream input = new FileInputStream("d:/test.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(input)) {

            int data = bufferedInput.read();
            while(data != -1){
                System.out.print((char) data);
                data = bufferedInput.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
