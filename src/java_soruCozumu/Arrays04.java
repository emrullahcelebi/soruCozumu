import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        int []arr=new int[8];
        Scanner scan=new Scanner(System.in);
int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ ". indexdeki sayilari girniz : ");
            arr[i]=scan.nextInt();
            if (arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
