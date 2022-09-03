package java_soruCozumu;

import java.util.Arrays;

public class C01 {
    /*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

 */

    public static void main(String[] args) {
       int[] nums ={-4,-1,0,3,10};

       // System.out.println(Arrays.toString(sortedArray(nums)));

        int[] nums2=Arrays.stream(nums).map(x->x*x).sorted().toArray();
        System.out.println(Arrays.toString(nums2));

    }

    /*public static int[] sortedArray(int [] num){
        int i=0;
        for(; i< num.length; i++){
            num[i]=num[i]*num[i];
        }
        Arrays.sort(num);
        return num;
    }*/
}
