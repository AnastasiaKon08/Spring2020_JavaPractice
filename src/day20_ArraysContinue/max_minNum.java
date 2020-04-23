package day20_ArraysContinue;

public class max_minNum {
    public static void main(String[] args) {
         int[] arr ={25674,678,8900,5,98,4500,80};
         int lastIndex = arr.length -1;
         int max = arr[0]; // 2
        int min = arr[0];


         for (int i =0; i<= lastIndex; i++){
             if (arr[i]>= max){
                 max = arr[i];
             }

             if (arr[i]<min) {
                 min= arr[i];
             }
         }


        System.out.println(max);

        System.out.println(min);













         /*write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE

          */
    }
}
