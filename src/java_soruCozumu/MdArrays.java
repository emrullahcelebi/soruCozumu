public class MdArrays {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        int min=arr[0][0];

        for (int i = 0; i < arr.length; i++) {//outer for
            for (int j = 0; j < arr[i].length; j++) {//inner for
                if (arr[i][j]<min)
                    min = arr[i][j];
            }
        }
        System.out.println("min = " + min);

    }
}
