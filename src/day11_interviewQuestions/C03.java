package day11_interviewQuestions;

import java.util.Scanner;

public class C03 {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
    kontrol edin
    Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
    1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
     sayı böleni olmalıdır.
     1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
     */
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("bir sayi girin");
        int sayi= scan.nextInt();

boolean asalMi=true;


        if (sayi>1){
            for (int i = 2 ; i < sayi ; i++) {//bolen sayilar
                System.out.print(i+" ");
                if (sayi%2==0){
                  asalMi=false;
                }
            }
            if (asalMi) System.out.println("sayi asaldir");
              else System.out.println("sayi asal degil ");

        }else System.out.println("sayi 1 den buyuk olmalidir");



    }
}
