package day11_interviewQuestions;

import java.util.Scanner;

public class C04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        String sifre="celebi.aa12";
        int girisSayisi=3;



        while (true){
            System.out.println("sifreyi giriniz");
            String girilenSifre=scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("giris basarili");
                break;
            }else {
                System.out.println("sifre yanlis");
                girisSayisi--;
                System.out.println("kalan giris hakki "+girisSayisi);
            }

            if (girisSayisi==0){
                System.out.println("giris hakkin kalmadi kart bloke "+girisSayisi);
                break;
            }
        }

    }
}
