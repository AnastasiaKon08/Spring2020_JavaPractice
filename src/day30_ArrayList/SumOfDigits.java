package day30_ArrayList;

public class SumOfDigits {
    public static void main(String[] args) {
        String str ="a1b2c3";
        char [] chars = str.toCharArray();
        int sum=0;
        for (int i =0; i<chars.length; i++){
            if (Character.isDigit(chars[i])){
               sum+= Integer.parseInt(""+ chars[i]); // converts "String" to int

            }
        }
        System.out.println(sum);
    }
}
