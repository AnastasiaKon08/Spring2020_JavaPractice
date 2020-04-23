package day22_Arrays_Loops;
import java.util.Arrays;

public class Discending {
    public static void main(String[] args) {

        int[] arr = {8574, 9463, 5, 52, 7685, 32, 54, 9};
        Arrays.sort(arr);
       //  System.out.println(Arrays.toString(arr));


        int[] arrNew = new int[arr.length];

        int j = arr.length-1; // represents index
        for(int i=0; i<arr.length; i++){
          arrNew[i]= arr[j];
          j--;
        }
        System.out.println(Arrays.toString(arrNew));












    }
}
