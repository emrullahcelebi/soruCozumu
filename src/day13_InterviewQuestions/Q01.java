package day13_InterviewQuestions;

import java.util.Scanner;

public class Q01 {
    //Armstrong sayisi


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();
        armstrong(sayi);
girlenSayiyaKadarOlanAmsstrongSayilar(sayi);

    }

    private static void girlenSayiyaKadarOlanAmsstrongSayilar(int sayi) {
        for (int i = 1; i <=sayi; i++) {
           armstrong(i);
        }

    }

    public static void armstrong(int sayi){
        int sayiniKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi;//sayiyi sayinin kupler tolami ile kiyaslamak icin

        while (sayi>0){
            basamaktakiSayi=sayi%10;//rakamrakm ayirdik sayiyi
            sayiniKuplerToplami +=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi =sayi/10;
        }

        if (girilenSayi == sayiniKuplerToplami){
            System.out.println("girilen sayi amstrong sayidir= " + girilenSayi);

        }else System.out.println("girilen sayi amstrong degil = "+girilenSayi);




    }
}
