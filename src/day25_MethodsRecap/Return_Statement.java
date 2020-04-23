package day25_MethodsRecap;

public class Return_Statement {

    public static void main(String[] args) {

        /*
        if (10>9){
            return; // exits the current method only
        }

        System.out.println("Hello");
         */
        method2();
        System.out.println("Hello");
    }
    public static void method1(){
        if (10>9){
            return; // exits the current method only
        }
    }

    public static void method2(){
        if (10>9){
            System.exit(0); // exits the entire system
        }

        System.out.println("Hello Cybertek");

    }
}
