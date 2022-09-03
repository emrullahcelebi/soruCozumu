package java_soruCozumu;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*String sayi = "1234";
        int sayi2 = Integer.parseInt(sayi);
        sayi2 += 1;
        System.out.println("sayi2 = " + sayi2);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("47 den kucuk bir sayi giriniz");

        int sayi = scanner.nextInt();
        fibonacci(sayi);

    }

    private static void fibonacci(int f) {


        if (f < 47) {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3;
            System.out.print(sayi1 + " ");
            System.out.print(sayi2 + " ");
            for (int i = 2; i < f; i++) {
                sayi3 = sayi1 + sayi2;
                System.out.print(sayi3 + " ");
                sayi1 = sayi2;
                sayi2 = sayi3;
            }

        } else System.out.println("47 den kucuk bir sayi giriniz");
    }


}