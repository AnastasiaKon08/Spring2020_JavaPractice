package Resources;

import java.util.Arrays;

public class Library {



    public static int [] sortDescending(int[] arr){
        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];
        int j= arr.length-1;
        for (int i =0; i<arr.length; i++){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }


    public static String Reverse(String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }
        return reverse;
    }

    public static String RemoveDuplicate(String str) {
        //
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(ch + "")) {
                result += ch;
            }
        }
        return result;
    }

    public static int Frequency(String str1, String str2){
        int count =0;

        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");

        }
        return count;

    }

    public static String FrequencyOfChars(String str) {
        String nonDup = Library.RemoveDuplicate(str);
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            String ch = "" + nonDup.charAt(i); //"A"
            int num = Library.Frequency(str, ch);
            result += ch + num;

        }
        return result;
    }
}
