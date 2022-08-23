public class MdArrays3 {
    public static void main(String[] args) {
        int[][]arr={{1,3,6}, {2,8}, {5,7,9,14}};


        System.out.println("ciftleriTOpla(arr) = " + ciftleriTOpla(arr));
    }

    private static int ciftleriTOpla(int[][] arr) {
        int toplam=0;

        for (int [] each1:arr) {
            for (int each2:each1) {
                if(each2%2==0){
                    toplam+=each2;
                }
            }
        }
        return toplam;
    }
}
