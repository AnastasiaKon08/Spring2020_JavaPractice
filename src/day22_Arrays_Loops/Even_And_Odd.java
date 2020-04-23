package day22_Arrays_Loops;

import java.util.Arrays;

public class Even_And_Odd {
    public static void main(String[] args) {
        int[] arr =  {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int odd =0;
        int even =0;

        for (int each: arr){
            if (each%2==0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
