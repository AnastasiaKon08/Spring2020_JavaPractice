package day24_Methods_Continue;
import java.util.Arrays;

public class ReturnMethod_Practice {
    public static void main(String[] args) {
        int[] arr = {456, 765, 43, 56, 76865, 5356};
        int max = MaxNum(arr);
        System.out.println(max);

        int min = MinNum(arr);
        System.out.println(min);
    }


    public static int MaxNum(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static int MinNum(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }


}
