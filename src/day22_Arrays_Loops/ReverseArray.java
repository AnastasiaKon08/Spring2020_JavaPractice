package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        int [] arr2= new int[arr.length];
            int i=arr.length-1;
            for (int j=0; j<arr.length; j++){
                arr2[j]=arr[i];
                i--;
            }
            System.out.println(Arrays.toString(arr2));
        }









    }

/*
warmup tasks:
    1. write a program that can reverse the array
    2. write a program that sort the array in descending order

    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
:heavy_check_mark:
1


 */