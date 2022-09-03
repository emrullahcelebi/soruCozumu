package java_soruCozumu;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLanguage01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();

        hackerDili(cumle);


    }

    private static void hackerDili(String cumle) {
        String arr[] = new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i, i + 1);
            //System.out.println(arr[i]);

            if (arr[i].contains("s")) {
                arr[i] = "5";
            }if (arr[i].contains("a")) {
                arr[i] = "4";
            }if (arr[i].contains("e")) {
                arr[i] = "3";
            }if (arr[i].contains("i")) {
                arr[i] = "1";
            }if (arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }

    }


}




