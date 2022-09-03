package java_soruCozumu;

public class Arrays10 {
    public static void main(String[] args) {

        int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("maymun gunde 4 muz yer");
        do {
            numberOfBananas -= 4;//muzdan 4 muz azalir
            survivalDays++;//yasadigi gun sayisi artar
            if (numberOfBananas < 4) {
                monkeyAlive = false;
                System.out.println("bu gun " + survivalDays + " . gun muz kalmadi, maymun rahmetlik");
            }else {
                System.out.println("bu gun " + survivalDays + " . gun maymun hala hayatta");
            }
        } while (monkeyAlive);
        System.out.println("toplam yasadigi gun sayisi :"+ (survivalDays-1));
    }
}
