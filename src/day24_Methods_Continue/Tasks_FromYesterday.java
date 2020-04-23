package day24_Methods_Continue;
import  java.util.Arrays;

public class Tasks_FromYesterday {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        MaxNumber(arr);
        MinNumber(arr);
        Descending(arr);
    }


    public static void MaxNumber(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);

    }

    public static void MinNumber(int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void Descending(int[] array) {
        Arrays.sort(array);
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+ " ");
        }
    }
}

/*
. create a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */