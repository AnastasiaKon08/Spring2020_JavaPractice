package day29_Wrapper_ArraysList;

import java.util.function.DoubleToIntFunction;

public class WrapperClass {
    public static void main(String[] args) {

        int a =100; // primitive
        Integer b = 200; // wrapper class
        b=a;

        short s1 = 200;
        int n1 = s1;

        // Integer N2 = s1; Wrapper class only excepts its primitive
        Integer n2 = n1;

        // ======================================

        int a1 =20;
        float f1= a1;

        // Float f2 = a1;

        Integer I1 =200;
        int a2= I1;

        Byte B1 = 126;
        int a3 = B1; // will accept another wrapper class
        System.out.println(a3);
    }
}
