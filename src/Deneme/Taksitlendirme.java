package Deneme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taksitlendirme {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Urunun fiyatini giriniz: ");
        double fiyat=scr.nextDouble();
        System.out.print("Taksit miktarini giriniz: ");
        int taksit=scr.nextInt();

        double  ayliktaksit=fiyat/taksit;

        int intayliktaksit=(int)ayliktaksit;
        double kusurat=ayliktaksit-intayliktaksit;
        double sonaytaksit=ayliktaksit+kusurat*taksit;


        LocalDate baslangic=LocalDate.now();


        System.out.printf( "%-11s%-19s%s" , "Tarih","Taksit", "Ucret");
        System.out.println();
        System.out.println("--------------------------------------------");
        for (int i = 1; i <=taksit-1 ; i++) {
            baslangic=baslangic.plusMonths(1);
            System.out.println(baslangic+" "  +i+  ". taksit miktari: "+intayliktaksit);


        }
        LocalDate baslangicayson=baslangic.plusMonths(1);
        System.out.println(baslangicayson+" "  + taksit +  ". taksit miktari: " + sonaytaksit);


    }

}
