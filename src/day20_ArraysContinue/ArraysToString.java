package day20_ArraysContinue;
import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] num2 = {9, 10, 11, 12, 13};

        int lastIndex = num1.length + num2.length; // can contain all the elements from array1 and array2
        int [] result = new int[lastIndex];

        for (int i=0; i<num1.length; i++){
            result[i] = num1[i];
        }

        for (int j =0; j<num2.length; j++){
            result[num1.length+j] = num2[j]; // continue where left off
        }


        String arr = Arrays.toString(result);
        System.out.println(arr);








        /*
        write a program that can combine two arrays of any lengths, and return the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7];
        arr3 ==> [1,2,3,4,5,6,7]

         */
    }
}
