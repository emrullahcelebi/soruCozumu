package java_soruCozumu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int []arr={2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
