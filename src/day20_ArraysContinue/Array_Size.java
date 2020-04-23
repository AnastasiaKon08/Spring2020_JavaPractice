package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        // System.out.println( arr[100] );  array's size fixed

        int [] nums = new int[2]; // {0,0}
        nums[0] = 10;
        nums[1] = 20;
        // nums[2] = 30; - out of range

        System.out.println(nums[1]); // 20
        System.out.println(nums[0]); //10

        nums = new int[3]; // reset
        System.out.println(nums[0]); // 0







    }
}
