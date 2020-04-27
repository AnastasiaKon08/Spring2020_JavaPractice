package day27_DataTime;

public class Unique_Array {
    public static void main(String[] args) {
        int[] arr = {33, 33, 4, 55, 66, 55, 66};
        uniqueElements(arr);
        double [] arr2 = {12.56, 56.7, 4.76, 98.65, 12.56, 56.7};
        uniqueElements(arr2);
    }

    public static void uniqueElements (int[] arr) {

        for (int i=0; i< arr.length; i++) {
            int count = 0;
            for (int each : arr) {
                if (each == arr[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void uniqueElements (double[] arr){

        for (int i=0; i< arr.length; i++) {
           int count =0;
            for (double each : arr) {
                if (each == arr[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
