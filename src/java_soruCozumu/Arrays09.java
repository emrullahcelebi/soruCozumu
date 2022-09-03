package java_soruCozumu;

import java.util.Arrays;

public class Arrays09 {
    public static void main(String[] args) {
        int arr[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        kacEleman(arr);
    }

    private static void kacEleman(int[][] arr) {
        int count=0;

        for (int i = 0; i < arr.length; i++) {//outer
            for (int j = 0; j < arr[i].length; j++) {//inner
                count++;

            }

        }

        System.out.println(count);
    }
}
