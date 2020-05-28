package day42_Inheritance;

import Resources.Inheritance;

public class Data {
    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";
}

class testing extends Data {
    // private and default not inherited
    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
       // System.out.println(Inheritance.defaultData);
    }
}