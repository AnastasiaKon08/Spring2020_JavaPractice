package day26_MethodOverloading;

public class Frequency_Arrays {
    public static void main(String[] args) {
        String str = "AAABBBFFFCSTFTFLIGAIGSA";
        char ch = 'A';
        int result = Frequency(str, ch);
        System.out.println(result);
    }

    public static int Frequency(String str, char ch){

        char[] arr = str.toCharArray();
        int count = 0;

        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
}
