package java_soruCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        int arr[] = {2, 34, 5, 2, 7, -34, 121, 56, 23, 121, 35, 13};
        int n = 4;
        List<Integer> list = new ArrayList<>();
        for (int each : arr
        ) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= n) {
        int max=list.get(0);//list in ilk elemani max olsun

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){
                    max = list.get(i);//max artik o eleman olsun
                }
            }
            maxList.add(max);//102 eklendi
            list.remove(list.indexOf(max));//max liste ekledigim elemani kaldiriyorum
            count++;
        }
        System.out.println(n+" elemani "+maxList);
    }
}
