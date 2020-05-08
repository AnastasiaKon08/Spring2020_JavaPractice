package day36_Static_Block;

public class StaticBlock3 {

    static String name;
    static int num;
    static {
        name = "Muhtar"; // can be used outside the class
        num = 100;
    }

    public static void main(String[] args) {
        name = "Ana"; // information set only within this class
        num = 200;

        System.out.println(name);
        System.out.println(num);
    }
}
