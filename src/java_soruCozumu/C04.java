package java_soruCozumu;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=scan.nextInt();
        tekSayilar(sayi);

    }

    private static void tekSayilar(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

    }
}
