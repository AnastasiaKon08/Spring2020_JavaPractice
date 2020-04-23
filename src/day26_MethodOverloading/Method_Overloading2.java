package day26_MethodOverloading;

import java.util.Arrays;

public class Method_Overloading2 {
    public static void main(String[] args) {
        int result = sum(34, 65, 76);
        System.out.println(result);
    }

    public static int sum (int a, int b){
        int sum = a+b;

        return sum;
    }

    public static int sum (int a, int b, int c){
        int sum= a+b+c;

        return sum;
    }

    public static int sum (int a, int b, int c, int d){
        int sum = a+b+c+d;

        return sum;
    }
}
