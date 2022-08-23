public class Arrays05 {
    public static void main(String[] args) {
        int arr1[][]={{0,2,-1},{3,8,9},{7}};
        int arr2[][]={{-7,6,-9},{0,12},{19}};
int toplam1=0;
int toplam2=0;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam1 +=arr1[i][j];
            }
        }
        System.out.println("toplam1: "+ toplam1);


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                toplam2+=arr2[i][j];
            }
        }
        System.out.println("toplam2 : "+toplam2);

    }
}
