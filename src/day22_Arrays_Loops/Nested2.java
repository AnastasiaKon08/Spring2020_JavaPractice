package day22_Arrays_Loops;

public class Nested2 {
    public static void main(String[] args) {

        int[][] numbers = {  {1, 2, 3},  {4, 5}, {6, 7, 8, 9, 10}};

        for (int h = numbers.length-1 ; h>=0; h--) {
            for (int i = numbers[h].length-1; i >=0; i--) {
                System.out.print(numbers[h][i]+" ");
            }
        }
        /*

        for (int j=0; j<numbers[1].length; j++){
            System.out.println(numbers[1][j]);
        }

        for (int k= 0; k<numbers[2].length; k++){
            System.out.println(numbers[2][k]);
        }
        for (int h = 0; h<numbers.length; h++){
            System.out.println("Hello");
        }
*/















    }
}
