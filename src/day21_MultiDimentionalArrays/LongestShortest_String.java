package day21_MultiDimentionalArrays;

public class LongestShortest_String {
    public static void main(String[] args) {

        String[] name = {"Mary", "Anastasia", "Ion", "Frederick"};
        int maxLength = name[0].length(); // String method
        String longestword = name[0];

        int minLength = name[0].length();
        String shortestword = name[0];

        for (int i =0; i<name.length; i++){
            if (name[i].length()> maxLength){
                maxLength= name[i].length();
                longestword = name[i];

            }

           if (name[i].length() < minLength){
               minLength= name[i].length();
               shortestword = name[i];
           }
        }
        System.out.println(longestword);
        System.out.println(shortestword);



    }
}
