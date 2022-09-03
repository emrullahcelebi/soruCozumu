package java_soruCozumu;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {


        int[]arr={4,2,6,8,2,13,55,64,12,65,22,88};
        fark(arr);


    }

    private static void fark(int[] arr) {
        Arrays.sort(arr);

        System.out.println((arr[arr.length-1])-arr[0]);
    }
}
