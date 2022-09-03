package java_soruCozumu;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Java Dunyasi";
        System.out.println(revers(name));
    }

    private static String revers(String name) {
        //1.yol
//        String str2="";
//
//        String[]str=name.split("");
//        for (int i = str.length-1;  i >=0 ; i--) {
//            str2=str2+str[i];
//
//        }
//        return str2;

        //2. yol daha hizli
        String str2 = "";
        String[] str = name.split("");
        String tmp = "";
        for (int i = 0; i < str.length; i++) {
            String start = str[i];
            String end = str[str.length - (i + 1)];

            //if (start == end) break;
            tmp = start;
            start = end;
            //end = tmp;
            str2 = str2 + start;

        }
        return str2;
    }
}
