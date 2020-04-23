package day25_MethodsRecap;
import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBCC";
       String result1 = FrequencyOfChars(str);
        System.out.println(result1);
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