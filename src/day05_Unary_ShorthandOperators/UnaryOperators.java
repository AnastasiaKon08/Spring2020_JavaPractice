package day05_Unary_ShorthandOperators;

public class UnaryOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = +a;

        int a2= -10;
        boolean result1 = a2>0; // false
        System.out.println(result1);
        boolean result2 = a2<0; // true
        System.out.println(result2);

        int x1 = -10;
        int y1 = -x1;
        System.out.println(y1);// positive 10

        int x2 = 20;
        int y2 = -x2;
        // -(20) ==> -20
        System.out.println(y2);


        int z = 100;
        System.out.println(++z); //101
        System.out.println(z); //101

        int p = 100;
        System.out.println(p++); //100 (current value first)
        System.out.println(p); //101  (increases value by 1)






    }
}
