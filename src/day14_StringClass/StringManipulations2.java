package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str = " ";

        boolean bool1 = str.isEmpty(); // false, when there is just space
        System.out.println(bool1);

        String username = "";

        if (username.isEmpty()){
            System.out.println("Please, provide username");
        }

        String s1 = "Cat"; // string literal
        String s2 = new String("Cat");
        System.out.println(s1==s2); // false, because two different memory locations
        System.out.println(s1.equals(s2)); //true


        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";
        String z4 = "Lion";

        System.out.println(z1==z2); // false
        System.out.println(z2 == z3); // false
        System.out.println(z1 ==z3); // true, cause both are string literals

        System.out.println(z1.equals(z2)); //true
        System.out.println(z2.equals(z3)); //true
        System.out.println(z1.equals(z3)); //true
        System.out.println(z3.equals(z4)); // false
    }
}

/*
userName: cybertek
password: cybertekschool
 */