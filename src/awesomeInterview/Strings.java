package awesomeInterview;

import sun.security.util.Password;

public class Strings {
    public static void main(String[] args) {
        System.out.println("My reversed name: " + reversed("Anastasia Kononosova"));
        System.out.println("The unique character is : " + uniqueCharacter("AABCFTTFYC"));
    }

    public static String reversed(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String uniqueCharacter(String str) {
        String[] arr = str.split(""); // converting String to array
        String unique1 = "";
        for (int j = 0; j < arr.length; j++) { // lopping through array
            int num = 0;

            for (int i = 0; i < arr.length; i++) { //looping through array and looking for matching character
                if (arr[i].equals(arr[j]))     // arr[0].equals(arr[1,2,3])
                    num++;
            }
            if (num == 1)
                unique1 += arr[j];
        }
        return unique1;

    }


    public static boolean passwordValidation() {
//        1. Password MUST be at least have 6 characters and should not contain space
//
//        2. PassWord should at least contain one upper case letter
//
//        3. PassWord should at least contain one lowercase letter
//
//        4. Password should at least contain one special characters
//
//        5. Password should at least contain a digit

        return true;
    }
}