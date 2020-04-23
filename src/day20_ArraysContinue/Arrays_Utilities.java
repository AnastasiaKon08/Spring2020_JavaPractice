package day20_ArraysContinue;
import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        String r = Arrays.toString(arr);
        System.out.println(r);
        // Arrays must be converted to string, before printing


        String [] name = {"Madina", "Alina", "Pavel", "Vitek"};

        System.out.println(Arrays.toString(name));

        double[] nums = {10, 20, 30, 40, 50 };
        String str = Arrays.toString(nums);
        System.out.println(str);
        System.out.println(nums[0]); //10.0






    }
}
