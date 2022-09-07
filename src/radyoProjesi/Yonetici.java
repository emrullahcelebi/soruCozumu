package radyoProjesi;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static radyoProjesi.Kullanici.kullanici;

public class Yonetici {
    static Scanner scan =new Scanner(System.in);
    static String yanit="";

    static ArrayList<Depo> kanalListesi=new ArrayList<>();


    public static void giris() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {

        String giris = "\n" + "***************************TREN FM***************************\n"+
                "1 : KULLANICI GIRISI\n" +
                "2 : YONETICI GIRISI\n" +
                "3 : CIKIS";
        System.out.println(giris);

        yanit=scan.next();

        switch (yanit){
            case "1" :
                kullanici();
                break;
            case "2" :
                yonetici();
                break;
            case"3":
                cikis();
                break;
        }
    }

    public static void yonetici() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        String yonetici="\n"+"1 : KANAL EKLEME\n"+
                             "2 : KANAL LISTESI\n"+
                             "3 : KANAL SIL\n"+
                             "4 : ANA MENU\n"+
                             "5 : CIKIS\n";
        System.out.println(yonetici);
        
        yanit= scan.next();
        
        switch (yanit){
            case "1" :
                kanalEkleme();
                devamMi();
                yonetici();
                break;
            case "2":
                kanalListesiGoster();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                Thread.sleep(3000);
                yonetici();
                break;
            case "3":
                kanalisil();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                Thread.sleep(3000);
                yonetici();
                break;
            case "4":
               giris();
                break;
            case  "5":
                cikis();
                break;
    }
}

    public static void cikis() {
        System.out.println("TREN FM KEYIFLI GUNLER DILER...");
    }

    public static void kanalisil() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        if (kanalListesi.isEmpty()){
            System.out.println("SILINECEK KANAL YOKTUR");
            System.out.println();
        }else {
            System.out.println("SILMEK ISTEDIGINIZ KANALLAR LISTESI");
            System.out.println(kanalListesi);
            scan.nextLine();
            System.out.println("SILMEK ISTEDIGINIZ KANALI YAZINIZ");
            String sil=scan.nextLine();
            for (Depo each:kanalListesi
                 ) {
                if (each.getIsim().equalsIgnoreCase(sil)){
                    kanalListesi.remove(each);
                    System.out.println("KANAL SILINDI");
                    System.out.println("MENUYE YONLENDIRILIYOR...");
                    Thread.sleep(3000);
                    yonetici();
                }

            }
        }
    }

    public static void kanalListesiGoster() {
        for(Depo each:kanalListesi){
            System.out.println(each);
        }
    }

    public static void kanalEkleme() {
        scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN ISMINI GIRINIZ");
        String isim = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN FREKANSINI GIRINIZ");
        String frekans= scan.next();

        Depo kanalEkleme=new Depo(isim,frekans);
        kanalListesi.add(kanalEkleme);
    }

    public static boolean devamMi(){
        boolean devamMi=false;

        System.out.println("YENI KANAL EKLEMEK ISTERMISINIZ\n" +
                "EVET YA DA HAYIR GIRINIZ");
        yanit= scan.next();

        while (yanit.equalsIgnoreCase("EVET")){
            kanalEkleme();
            System.out.println("YENI KANAL EKLEMEK ISTERMISINIZ\n" +
                    "EVET YA DA HAYIR GIRINIZ");
            yanit= scan.next();

        }
        return devamMi;

    }
    }
