package day21_MultiDimentionalArrays;

public class FoeEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for (int each: nums) {
            System.out.println(each);
        }
        System.out.println("==================================");

        String [] students = {"Muhtar" , "Anastasia", "Kathrine", "Hanna"};
        for (String eachElement: students){
            System.out.println(eachElement);
            }

        System.out.println("==================================");

        int[]arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int each1: arr1){
            if (each1<5){
                continue;
            }
            System.out.print(each1);


        }

        System.out.println();
        System.out.println("==================================");


        String sentence = "I like Java";
        String[] words = sentence.split(" ");
        String result ="";
         for (int i = words.length-1; i>=0; i--){
             result+= words[i]+" ";
         }
        System.out.println(result);


    }
}
