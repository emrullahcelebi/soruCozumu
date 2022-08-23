import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word="";

        do {
            System.out.print("Lutfen bir kelime giriniz: ");
            word=scan.nextLine();
            if (word.length()<3){
                System.out.println("girilen word 3 den az");
            }if (word.length()%2==1 && word.length()>=3){
                System.out.println("ortadaki karakter :"+word.charAt(word.length()/2));
            }else {
                System.out.println("yanlis girildi");
            }
        }while(!(word.length()%2==1 && word.length()>=3));


    }
}
