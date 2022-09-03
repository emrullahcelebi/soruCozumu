package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    /*
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
           hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
   */

    /*
   daha oncelikler Scannner obj olusturcaz
   onceliklr split methodu kullanicaz
   sonra sort yapcaz
   for loop a alcaz
   if ile control yapicaz ve sout ile yazdiricaz
    */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("lutfen bir String giriniz");
        String str = scan.nextLine().toLowerCase();

        String[] arr = str.split("");
        System.out.println("arr = " + Arrays.toString(arr));

        //sort() la
        Arrays.sort(arr);//siraladi
        System.out.println("arr = " + Arrays.toString(arr));

        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].equals(arr[i])) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " karakteri " + (count + 1));
                count = 0;
            }
            if (i == arr.length - 1) {//for loop da en son geldiginde
                System.out.println(arr[i] + " karakteri " + (count + 1));
            }

        }

    }
}
