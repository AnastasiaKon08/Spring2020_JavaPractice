package day27_DataTime;

public class Find_Min {

    public static void main(String[] args) {
        int[] arr = {500, 487, 2567, 895,};
        double [] arr2 = {12.56, 56.7, 4.76, 98.65};
        System.out.println(minimum(arr));
        System.out.println(minimum(arr2));
             }

        // System.out.println(minimum);



    public static int minimum (int[] arr){
        int minimum = arr[0];
        for (int each: arr){
            if (each< minimum){
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr){
        double minDouble = arr[0];
        for (double each: arr){
            if (each<minDouble){
                minDouble = each;
            }
        }

        return minDouble;
    }
}
