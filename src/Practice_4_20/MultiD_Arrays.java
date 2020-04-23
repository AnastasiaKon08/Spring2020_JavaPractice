package Practice_4_20;

import java.util.Arrays;

public class MultiD_Arrays {
    public static void main(String[] args) {

        char [][] arr2D = {   {'A','B', 'C', 'D' },{'E', 'F', 'G'}, {'H', 'I', 'J' } };

        for (int j=0; j<arr2D.length; j++){
        for (int i = 0; i< arr2D[j].length; i++) {
            System.out.println(arr2D[j][i]);
        }

        }

        System.out.println();
        for (char[] eachArray: arr2D){

            for( char eachelement: eachArray){

                System.out.print(eachelement);
            }
        }












        /*
        int [][] arr2D = {  {1, 2, 3, 4}, { 5, 6, 7, 8, 9} };
         System.out.println(Arrays.toString(arr2D[1]));
         */
















    }
}
