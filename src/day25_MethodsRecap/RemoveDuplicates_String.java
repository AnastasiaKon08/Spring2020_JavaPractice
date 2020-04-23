package day25_MethodsRecap;

public class RemoveDuplicates_String {
    public static void main(String[] args) {
        String str = "ABABCVCVDG";
        String result2 = RemoveDuplicate(str);
        System.out.println(result2);
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

    }

