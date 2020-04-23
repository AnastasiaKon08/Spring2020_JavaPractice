package day14_StringClass;

public class String_Manipulation3 {
    public static void main(String[] args) {

        String str = "CYBERTEK";
        String str1 = "cybertek";

        System.out.println(str1.equals(str));
        System.out.println(str.equalsIgnoreCase(str1)); //true

        String gmail = "cybertekschool@gmail.com";
        String userinput = "CybertekSchool@gmail.com";

        boolean bool1 = gmail.equalsIgnoreCase(userinput);
        if (bool1)
            System.out.println("Logged in");
        else
            System.out.println("Try again");


        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School"); // true
        System.out.println(r1);

        System.out.println("================================");
        /*
        valid password must contain a special character such as (1, _, $)
        valid password should not contain spaces
         */

        String password = "mmasd1235";

        if (password.contains(" ")){
            System.out.println("Password cannot contain space");
        } else {
            System.out.println("Valid");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U")); //true


        System.out.println("================================");

        String webAdress = "Www.amazon.ru";
        webAdress= webAdress.toLowerCase();

        if (webAdress.startsWith("www.") && webAdress.endsWith(".com")){
            System.out.println("Web site is valid");
        } else
            System.out.println("Web site address is invalid");









    }
}
