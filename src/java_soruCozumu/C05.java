package java_soruCozumu;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String okunan="";
        do {
            System.out.print("harf giriniz: ");
            okunan=scan.next();
            System.out.println("Program calisiyor");
        }while(!okunan.equalsIgnoreCase("x"));
        System.out.println("Program bitti");
    }
}
