package day24_Methods_Continue;
import java.util.Arrays;

public class Array_Descending {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 9 ,45 , 5};

        int[] arr2 = {200, 320, 150, 100};

        int[] arr3 = {2847, 6794, 3586, 347, 5492};

        arr2 = sortDescending(arr2);
        System.out.println(Arrays.toString(arr2));


    }
    public static int [] sortDescending(int[] arr){
        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];
        int j= arr.length-1;
        for (int i =0; i<arr.length; i++){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }
}
