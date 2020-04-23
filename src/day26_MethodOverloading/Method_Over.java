package day26_MethodOverloading;

public class Method_Over {
    public static void main(String[] args) {
        method(10);
    }

    public static void method(int a ){
        System.out.println("original method");

    }

    public static void method(int a, int b){
        System.out.println("Overloaded method");

    }
}
