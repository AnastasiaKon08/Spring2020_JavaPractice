package day22_Arrays_Loops;

public class NestedLoop {
    public static void main(String[] args) {

        char[][] arr2D = {  {'A', 'B', 'C'},  {'D', 'E'}, {'F', 'G', 'H'}   }; // Each index must be single dementional array


        for (int j =0; j<arr2D.length; j++){

        for (int i =0; i<arr2D[j].length; i++){
            System.out.println(arr2D[j][i]);
        }
/*
        for (int j=0; j<arr2D[1].length; j++){
            System.out.println(arr2D[1][j]);
        }

        for (int k=0; k<arr2D[2].length; k++){
            System.out.println(arr2D[2][k]);
        }

*/


        }

    }
}
