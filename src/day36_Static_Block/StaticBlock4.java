package day36_Static_Block;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1 = new Tester();
    int insVariable;

    static { // designed for statics only
        name = "Cybertek School";
        tester1.setTesterInfo("Peter", 765, "SDET", 120);

     /*   StaticBlock4 obj1 = new StaticBlock4();
        obj1.insVariable = 300; // ins Variable can be called only through the object name

      */

    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable); // 0
    }
}
