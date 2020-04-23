package day05_Unary_ShorthandOperators;

public class postPre {

    public static void main(String[] args) {
        int a2 = 100;
        System.out.println(++a2); // a=101
        System.out.println(a2);

        int b = 100;
        System.out.println( --b); // 99

        int a1 = 100;
        System.out.println(a1++); //100
        System.out.println(a1); //101


       /* int a = 50;
        a= --a + a++ + a-- + a++; // 49+49+50+49+49
        System.out.println(a);
*/

        int x = 4;
        int y = x*4 - x++;
        System.out.println(y);


        int a =1;
        a = -a-- + a++ / -a-- * --a;
        // -1 + 0/ -1 * 0

        System.out.println(a);
        //  -1   +  0  / - 1   *  -1
        // -1 + 0 * -1
        //  -1 + 0 = -1


    }
}
