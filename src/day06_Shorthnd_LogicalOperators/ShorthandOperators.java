package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 2;
        a*=3;

        System.out.println(a);

        int b = a*=10;
         // b = a = a*10 = 60
        System.out.println(b); //60
        System.out.println(a); //60

        int a1 = 100; //200
        int b1 = (a1*= 2 ) + ++a1;

        // b1 = 200 + 201
        // b1 = 401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2; // x1= x1 + 20
        // x1 += 20; ==> 30

        int q = 20;
        int p = q*= 20*3;
               // q*60 // q = q*60

        int num1 = 300;
        num1/=2; // num1 = num1/2

        System.out.println(num1); //150

        int num2 = 400;
        num2 /= 20 + 10; // num2 = num2/ (20+10)
        System.out.println(num2); // 400 / 30 == 13.123
                                // 13


        int num3 = 300;
         num3 %= 10+20; // num%= 30
                        // num = num %30 == 300%30 == 0

        int n1 = 400;
        n1%= 3*5 ; //  n1%=15 ==> 400%15 = 10
        System.out.println(n1);









    }
}
