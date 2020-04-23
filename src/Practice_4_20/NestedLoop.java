package Practice_4_20;

public class NestedLoop {
    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        for (int j=0; j<numbers.length; j++){
            for (int i=0; i<numbers[j].length; i++){
                if (numbers[j][i] % 2 !=0){
                    continue;
                }
                System.out.print(numbers[j][i]);
            }
        }




        /*
        for (int[] eachArr: numbers){
            for( int eachNum: eachArr){
                if (eachNum%2!=0){
                    continue;
                }
                System.out.print(eachNum);
            }
        }


         */


    }
}
