package day35_Static;

public class StaticVariable2 {

    int insVariable;
    static int staticVariable; // one copy of static shared by all objects

    public static void main(String[] args) {

        StaticVariable2 obj1 = new StaticVariable2(); // new object of a class
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        StaticVariable2 obj2 = new StaticVariable2();
       // obj2.insVariable = 400;

        System.out.println( obj1.insVariable );
        System.out.println( obj2.insVariable);
        System.out.println();

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        System.out.println();

        System.out.println(StaticVariable2.staticVariable); // 400, static can be called through class name
        System.out.println();


    }
}
