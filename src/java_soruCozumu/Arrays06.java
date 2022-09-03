package java_soruCozumu;

public class Arrays06 {
    public static void main(String[] args) {

        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str=str.replace(" ","");
        System.out.println(str);
        System.out.println(str.length());

        String harf[]=str.split("");
        System.out.println(harf.length);


        String str1="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[]=str1.split(" ");
        int boslukSayisi=kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);
        String charcter[]=str1.split("");
        System.out.println("charcter.length-boslukSayisi = " + (charcter.length - boslukSayisi));
    }
}
