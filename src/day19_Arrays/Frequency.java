package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        String str = "AABCCSSSSSSQQQQYTFHJ";
        String result = ""; //A2B1C2

        String nonDup = "";


        for (int i = 0; i<=str.length()-1; i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+= str.charAt(i);
            }
        }
         System.out.println(nonDup);
        int count = 0;

       for (int j=0; j<=nonDup.length()-1; j++) {
           char ch = nonDup.charAt(j);


           for (int i = 0; i <= str.length() - 1; i++) {
               if (str.charAt(i) == nonDup.charAt(j)) {
                   count++;
               }
           }

           // System.out.println(count);

           result += "" + ch + count;

       }
        System.out.println(result);





    }
}

/*
2. write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"
 */