package day13_StringClass;

public class String_Literals {
    public static void main(String[] args) {

        String str1 = "Cat"; // goes to string pool
        String str2 = new String("Cat"); // Java Heap

        System.out.println(str1+ " : "+ str2);
        System.out.println(str1 == str2); // false, cause they are two different objects

        String str3 = "Cat"; // String pool

        System.out.println(str1 == str3); // true,


        String str4 = new String("Cat");
        System.out.println(str2==str4); // false. Two independent objects


        String s1 = "Java"; // goes to string pool, immutable
        s1 = "JavaScript"; // new object is created in memory
        System.out.println(s1); // JavaScript

        String s2 = "Java"; // no new object is created

        System.out.println(s1==s2);// "JavaScript" == "Java" // false
















    }
}
