package day21_MultiDimentionalArrays;

public class NestedForeach_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        int odd =0;
        for (int[] each : numbers){
            for (int num : each){
                if (num%2!=0){
                    odd++;
                } else {
                    System.out.print(num + " ");
                }
            }

        }
        System.out.println();
        System.out.println(odd);




    }
}
