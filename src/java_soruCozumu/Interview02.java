package java_soruCozumu;

import java.util.Scanner;

public class Interview02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir String giriniz");
        String input=scan.nextLine();
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        ilkSOnHarf(input,sayi);
    }

    private static void ilkSOnHarf(String str, int n) {
        String s=str.substring(0,1)+str.substring(str.length()-1);
        String sonuc="";

        for (int i = 1; i <=n; i++) {
            sonuc +=s;

        }
        System.out.println(sonuc);
    }
}
