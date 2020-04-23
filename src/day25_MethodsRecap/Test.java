package day25_MethodsRecap;

import Resources.Library;

public class Test {
    public static void main(String[] args) {

        String str = "ABCBCDFDFREAA";
        String str1 = "B";

        String result = Library.RemoveDuplicate(str);
        System.out.println(result);

        int result2 = Library.Frequency(str, str1);
        System.out.println(result2);

        String result3= Library.FrequencyOfChars(str);
        System.out.println(result3);
    }
}
