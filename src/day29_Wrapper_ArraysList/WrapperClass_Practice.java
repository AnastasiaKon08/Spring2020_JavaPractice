package day29_Wrapper_ArraysList;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
         String [] arr = {"1", "2.5", "3", "3.5", "4.5"};
         double max = Double.MIN_VALUE; // min number os double primitive
         for(String each: arr){
             double num = Double.parseDouble(each); // converts String to double
             if (num>max){
                 max = num;
             }
         }
        System.out.println(max);

        System.out.println("=============================");
        String[] arr2 = {"1", "2.5","5",  "3", "3.5", "4.5"};
        double[] arr3 = new double [arr2.length];

        for (int i=0; i<arr3.length; i++){
           arr3[i]= Double.parseDouble(arr2[i]);
        }
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3[arr3.length-1]);









    }











}
