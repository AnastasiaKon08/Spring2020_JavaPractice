package day22_Arrays_Loops;

import java.util.Arrays;

public class MultiD_Arrays {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3};

        int[][] arr2D = {  {1, 2, 3},    {4, 5, 6} };

        int [] arr1D = arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(arr2D[0][2]);

        System.out.println(Arrays.deepToString(arr2D));
        int num = arr2D[1][1];
        System.out.println(num);

        for (int each : arr2D[0]){
            System.out.println(each);
        }

        for(int i= 0; i<arr2D[0].length; i++){
           int n = arr2D[0][i];
            System.out.println(n);
        }



    }
}
