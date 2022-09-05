package day13_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34...
     */

    public static void main(String[] args) {
        List<Integer> fibonacciList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi=scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i=1;//while sartini olusturmak icin kullandim
        if (sayi<=1){
            System.out.println("dahabuyuk bir sayi giriniz");

        }else {
            while (fibonacciList.get(i)<sayi){//fibonacci elemanlari sayidan kucuk oldugu surece
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));//bir onceki elemani bir sonraki eleman ile toplar
                i++;
            }

            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiEleman=fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman)>sayi){
            fibonacciList.remove(sonIndextekiEleman);//son elemani kalidirir
            System.out.println("girdigin sayi  fibonacci dizisinde bulunmamaktadir = " +
                    " sizin girdiginiz sayiya kadarki fibonacci dizisi "+ fibonacciList);

        }else {
            System.out.println("sesin girdigin sayifibonacci listesinde var  fibonacciList "+fibonacciList);
        }
    }



}
