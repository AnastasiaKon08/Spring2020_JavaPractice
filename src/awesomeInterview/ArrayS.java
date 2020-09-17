package awesomeInterview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayS {
    public static void main(String[] args) {
//        System.out.println("maximum(new int[]{2, 3, 4, 56, 786, 54, 0, 0, 23}) = " + maximum(new int[]{2, 3, 4, 56, 786, 54, 0, 0, 23}));
//        System.out.println("maxValue(new int[]{2, 3, 4, 56, 786, 54, 0, 0, 23}) = " + maxValue(new int[]{2, 3, 4, 56, 786, 54, 0, 0, 23}));
//        System.out.println(Arrays.toString(moveZeroesToEnd(new int[]{2, 0, 0, 4, 56, 786, 54, 0, 0, 23, 0})));
        descending(new int[]{2, -3, 4, 56, 786, 54, 8, 0, 23});
    }

    public static int maximum(int[] arr){ // Using sort method
        Arrays.sort(arr);
        int max = arr[arr.length-1];

        return max;
    }

    public static int maxValue( int[]  arr ) { //Without sort method

        int max = Integer.MIN_VALUE;
        for(int each: arr)
            if(each > max)
                max = each;
        return max;
    }

    public static int[] moveZeroesToEnd(int[] arr){
        ArrayList<Integer> moved = new ArrayList<>();
        int count = 0;
         for (int each: arr) {
             moved.add(each);
             if (each == 0) {
                 count++;
             }
         }
             moved.removeAll(Arrays.asList(0)); //remove all zero values from arrayList
             arr = new int[arr.length];  // reassigning the arr, making all values == zero
              for (int i =0; i< arr.length-count; i++){ // looping through arr reassigning values without zeroes
                  arr[i]= moved.get(i);                 // the values left will be zeroes
              }
        return arr;

    }

    public static int[] switchArray(int[] arr){

        Arrays.sort(arr);
        //  System.out.println(Arrays.toString(arr));


        int[] arrNew = new int[arr.length];

        int j = arr.length-1; // represents index
        for(int i=0; i<arr.length; i++){
            arrNew[i]= arr[j];
            j--;
        }
        //System.out.println(Arrays.toString(arrNew));

        return arrNew;
    }

    public static void descending(int[] arr){
       ArrayList<Integer> list1 = new ArrayList<>();
       for (int each: arr){
           list1.add(each);
       }

       list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
       }


    }




