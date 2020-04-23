package Practice_4_20;
import java.util.Arrays;
public class ArraysUti {
    public static void main(String[] args) {
        int[] arr = {9, 3, 456, 6, 7, 9, 90};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] salaries = { 1000, 45000, 10000, 130000, 453 };
        int length = salaries.length;
        int lastIndex = length -1;
        Arrays.sort(salaries);
        System.out.println(salaries[0]); // min number
        System.out.println(salaries[lastIndex]); // max number

        System.out.println("===============================");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2)); // true. Checks each index of an array



    }
}
