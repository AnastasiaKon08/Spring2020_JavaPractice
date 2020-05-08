package day36_Static_Block;

import day34_CustomClass.Tester;

public class StaticBlock2 {
    static  int a;
    static int b;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("Jane", 123, "SDET", 120000); // information will be used only within the main method
        System.out.println(tester1);
    }

    static{

        tester1.setTesterInfo("Mark ", 235749, "SDET", 135000);
        a =100;
        b=200;

        if (100>200){
            a= 100;
        } else {
            b=200;
        }
    }
}
