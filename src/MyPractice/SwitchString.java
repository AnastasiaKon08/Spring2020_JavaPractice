package MyPractice;

public class SwitchString {
    public static void main(String[] args) {
        String str1 ="java";
        String str2 = "fun";

        str1 = str1.concat(str2);
        System.out.println(str1);

        str2 = str1.substring(0, str1.length()-str2.length() );
        str1 = str1.substring((str1.length()-str2.length())+1);
        System.out.println(str1);
        System.out.println(str2);
    }
}
