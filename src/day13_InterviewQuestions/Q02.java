package day13_InterviewQuestions;

public class Q02 {

    //stringi ters ceviren program

    public static void main(String[] args) {
        String str="All is well";
        StringBuilder sb=new StringBuilder();

        sb.append(str);//ekleme yapar
        System.out.println(str);

        String tersSb=sb.reverse().toString();//builder dondugu icin toString ile tekrar string e cevirdik

        System.out.println("tersSb = " + tersSb);

        System.out.println("=========2. yol============");

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));//her bir karekteri aldik yazdirdik
        }
    }

}
