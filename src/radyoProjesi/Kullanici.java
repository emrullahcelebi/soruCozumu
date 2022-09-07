package radyoProjesi;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static radyoProjesi.Yonetici.cikis;

public class Kullanici {
    static Scanner scan = new Scanner(System.in);
static String yanit;



    public static void kullanici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String yonetici="\n"+"DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n" +
                "1 : POWER FM\n" +
                "2 : SLOW TURK\n" +
                "3 : METRO FM\n" +
                "4 : VIRGIN RADIO\n" +
                "5 : ALEM FM\n" +
                "6 : CIKIS";
        System.out.println(yonetici);
        yanit= scan.next();
        switch (yanit){
            case "1":
                powerFM();
                break;
            case "2":
                slowTurk();
                break;
            case "3":
                metroFM();
                break;
            case "4":
                virgin();
                break;
            case "5":
                alemFM();
                break;
            case "6":
                cikis();

        }
    }

    public static void powerFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
File file=new File("src/radyoProjesi/aylin_coskun_ft._hande_yener.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while (!yanit.equalsIgnoreCase("Q")){
            System.out.println("1 : OYNAT\n" +
                    "2 :DUR\n" +
                    "3 :BASTAN OYNAT\n" +
                    "4 : KANAL LISTESI\n" +
                    "Q : CIKIS");
            yanit = scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();
                    break;
                case "Q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n" +
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);

                }

            }
        }
    }
    public static void virgin() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radyoProjesi/mp3/ayla-celik_haberim-var.mp3");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while (!yanit.equalsIgnoreCase("Q")){
            System.out.println("1 : OYNAT\n" +
                    "2 :DUR\n" +
                    "3 :BASTAN OYNAT\n" +
                    "4 : KANAL LISTESI\n" +
                    "Q : CIKIS");
            yanit = scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();
                    break;
                case "Q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n" +
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);

                }

            }
        }
    }
    public static void slowTurk() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radyoProjesi/mp3/enyenimp3indir-Aydilge-Kiralik_Ask.mp3");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while (!yanit.equalsIgnoreCase("Q")){
            System.out.println("1 : OYNAT\n" +
                    "2 :DUR\n" +
                    "3 :BASTAN OYNAT\n" +
                    "4 : KANAL LISTESI\n" +
                    "Q : CIKIS");
            yanit = scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();
                    break;
                case "Q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n" +
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);

                }

            }
        }
    }

    public static void metroFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radyoProjesi/mp3/David Guetta - Hey Mama (Official Video) ft Nicki Minaj, Bebe Rexha & Afrojack.mp3");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while (!yanit.equalsIgnoreCase("Q")){
            System.out.println("1 : OYNAT\n" +
                    "2 :DUR\n" +
                    "3 :BASTAN OYNAT\n" +
                    "4 : KANAL LISTESI\n" +
                    "Q : CIKIS");
            yanit = scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();
                    break;
                case "Q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n" +
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);

                }

            }
        }
    }
    public static void alemFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radyoProjesi/mp3/Desi Look Video Song - Sunny Leone - Ek Paheli Leela - Music- Dr. Zeus.mp3");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while (!yanit.equalsIgnoreCase("Q")){
            System.out.println("1 : OYNAT\n" +
                    "2 :DUR\n" +
                    "3 :BASTAN OYNAT\n" +
                    "4 : KANAL LISTESI\n" +
                    "Q : CIKIS");
            yanit = scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();
                    break;
                case "Q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n" +
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);

                }

            }
        }
    }
}
