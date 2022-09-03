package day10_practice1.okul_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

 /*
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
      ogretmenler olusturun ve bilgilerini yazdirin
     */

    static Scanner scan=new Scanner(System.in);
    static List<OgretmenBilgileri> ogretmenList=new ArrayList<>();
 public static void main(String[] args) {
     System.out.println("Hos geldiniz okulumuza ");

     System.out.println("isim giriniz");

     String isim=scan.nextLine();

     System.out.println("soyisim giriniz");
     String soyisim=scan.nextLine();
     System.out.println("yasinizi giriniz");
     int yas=scan.nextInt();
     scan.nextLine();//hayalet DUMMY
     System.out.println("bransinizi giriniz");
     String brans=scan.nextLine();

     System.out.println("tel no giriniz");
     String tel=scan.nextLine();

     OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas, brans,tel);


     ogretmenList.add(adayOgretmen);

     System.out.println("ogretmenList = " + ogretmenList);
 }
}
