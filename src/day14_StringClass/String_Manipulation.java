package day14_StringClass;

public class String_Manipulation {
    public static void main(String[] args) {
        String str = "I like to learn Java. I like to watch the movie Jumanji";
        int a1 = str.indexOf("J"); //returns the index number of thr first J
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I")+1;// second I's index number
        System.out.println(a3);

        String str2 = "I like Java, and I like reading";
        int a4 = str2.lastIndexOf("I");
        System.out.println(a4);

        int b2 = str2.lastIndexOf("l");
        System.out.println(b2);








    }
}

