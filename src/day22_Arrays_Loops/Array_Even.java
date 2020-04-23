package day22_Arrays_Loops;

import java.util.Arrays;

public class Array_Even {
    public static void main(String[] args) {

        int[] numbers = new int[200];

        //System.out.println(Arrays.toString(numbers));

        // numbers[99] =100;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");
        }
    }
}

























