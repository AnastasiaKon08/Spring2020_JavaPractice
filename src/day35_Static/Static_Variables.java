package day35_Static;

public class Static_Variables {
    int a2= 200; // instance variable

    static int a3 = 300; // static variable

    public static void main(String[] args) {


        int a1= 100; // local variable

        Static_Variables obj1 = new Static_Variables();
        obj1.a2 = 1000;

        obj1.a3 = 4000;

        Static_Variables obj2 = new Static_Variables();
        obj2.a2 =2000;

        obj2.a3 = 5000;

        System.out.println(obj1.a2);
        System.out.println(obj2.a2);

        System.out.println(obj1.a3);
        System.out.println(obj2.a3);

    }
}
