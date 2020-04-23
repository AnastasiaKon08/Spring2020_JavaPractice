package day20_ArraysContinue;
import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {
        int[] arr1 = {9, 8,478, 45, -6, 0, 2};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        int min = arr1[0];
        System.out.println(min);

        int max = arr1[arr1.length-1];
        System.out.println(max);


        char[] ch = {'$', 'D', '#', 'a','F'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));


        String[] str = {"Masha", "Dasha", "Kate", "Elizabeth", "1wsr3"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println("================================");


        int[] n = {5,67,87,3, 4,5, 768};
        Arrays.sort(n);
        int[] nDec = new int[n.length];
        int j =0; // represents the index of nDec

        for (int i=n.length-1; i>=0; i--){
            // System.out.print(n[i]+" ");
           nDec[j]= n[i];
           j++;
        }

        System.out.println(Arrays.toString(nDec));
    }
}
