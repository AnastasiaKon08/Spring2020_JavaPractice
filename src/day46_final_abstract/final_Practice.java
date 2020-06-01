package day46_final_abstract;

public class final_Practice {
    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);

    }

    static {
        System.out.println(b);
        // b = 30; cannot be reassigned
    }

    public final_Practice() {

    }

   final void method() {

    }

    public final static void method1() {

    }

    private final void method(int a){

    }

    public final static void method1(int a){

    }

}

    class test extends final_Practice{



    }


