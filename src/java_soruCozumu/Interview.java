import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {

        String pin="Celebi88";
        int girisHakki=3;
        Scanner scan=new Scanner(System.in);
        System.out.println("************HOSGELDINIZ**************");

        while (true){

            System.out.println("pin kodunu giriniz");
            String girilenPin=scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("Tebrikler.. Basarili giris");
                break;
            }else {
                girisHakki --;
                System.out.println("Basarisiz giris. "+girisHakki+ " giris hakkiniz kaldi ");
            }
            if (girisHakki==0){
                System.out.println("GIris hakki kalmadi bloklandiniz");
                break;
            }
        }
    }
}
