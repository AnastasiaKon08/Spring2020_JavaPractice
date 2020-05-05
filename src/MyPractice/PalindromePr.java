package MyPractice;

public class PalindromePr {
    public static void main(String[] args) {
        String str = "Race car";
        str = str.toLowerCase();
        str =str.replace(" ", "");
        String str2 ="";
        for (int i=str.length()-1; i>=0; i--){
            str2 += ""+ str.charAt(i);
        }
        String result = (str.equals(str2))? "palindrome" : "not a palindrome";
        System.out.println(result);
    }
}
