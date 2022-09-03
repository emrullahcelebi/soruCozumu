package java_soruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arrays07 {
    public static void main(String[] args) {
        List<String> dataBaseIsimler = new ArrayList<>();
        dataBaseIsimler.add("Ali");
        dataBaseIsimler.add("Cemil");
        dataBaseIsimler.add("Veli");
        dataBaseIsimler.add("Selim");
        dataBaseIsimler.add("Cemil");
        dataBaseIsimler.add("Derya");
        dataBaseIsimler.add("Sadik");
        System.out.println("dataBaseIsimler = " + dataBaseIsimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("user name girinizz");
        String userName = scan.nextLine().trim();

        boolean userNsmeVarMi = dataBaseIsimler.contains(userName);
        if (userNsmeVarMi) {
            System.out.println("kullanici adi zaten alinmis");
        } else System.out.println("bu kullanici ismini kullanabilirsiniz");
        if (userNsmeVarMi){
            int ramdomSayi=new Random().nextInt(100);
            userName= userName+""+ramdomSayi;
            System.out.println("yeni kullanici adiniz : "+userName);
            dataBaseIsimler.add(userName);
            System.out.println("dataBaseIsimler = " + dataBaseIsimler);
        }else {
            System.out.println("yeni kullanici adiniz : "+userName);
        }
    }
}
