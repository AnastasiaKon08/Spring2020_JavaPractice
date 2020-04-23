package day26_MethodOverloading;

public class Method_Overload3 {
    public static void main(String[] args) {
        sum(10,20);
        sum(10.5, 20.5);
    }
    public static void sum (int a, int b){
        System.out.println(a+b);
    }

    public static double sum (double a, double b){
        return a+b;
    }
}
