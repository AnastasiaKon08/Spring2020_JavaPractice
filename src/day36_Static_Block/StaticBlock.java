package day36_Static_Block;

public class StaticBlock {


    public static void main(String[] args) {
        System.out.println("Main method executed");
        method();
    }

    public static void method(){
        System.out.println("Custom method executed ");
    }

    static{ // static block runs first, only one time
        System.out.println("Static block executed");
    }


}
