package day11_interviewQuestions;

public class C05 {
    //normal toplmama methodu varargs ile toplama methodu yaziniz

    public static void main(String[] args) {

        int[] arr = {17, 23, 33, 9, 20};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsToplaList(25, 63, 44, 12);
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
        //vararrgs array gibi davrandigi icin herhangi bir array i pm olarak verebiliriz
    }

    private static int varargsToplaArr(int... i) {
        int toplam=0;
        for (int e:i) {
           toplam+=e;
        }
        return toplam;
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3) {
    }

    private static int arrTopla(int[] arr) {
        int toplam = 0;
        for (int each : arr) {
            toplam += each;
        }
        return toplam;
    }

}
