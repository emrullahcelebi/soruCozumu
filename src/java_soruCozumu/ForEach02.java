package java_soruCozumu;

public class ForEach02 {
    public static void main(String[] args) {

        String[] list = {"fruits", "meat", "milk", "vegetables"};

        for (String each : list) {
            System.out.println(each + " : " + each.length());
        }
        System.out.println();

        for (String each : list) {
            if (each.startsWith("v")) {
                break;
            }
            System.out.println(each);
        }
    }
}
