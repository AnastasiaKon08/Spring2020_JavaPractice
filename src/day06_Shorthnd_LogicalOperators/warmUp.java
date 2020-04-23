package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {
        double numberOfGalons = 5;
        double galonsToLiters = numberOfGalons*3.785;
        String result = numberOfGalons + " gallons equal to: " + galonsToLiters+ " liters";
        // System.out.println(result);

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        // -200 + - 200 * 200 % 2
        // -200 + - 40000 % 2
        // -200
        System.out.println(b);

        //int x = 300;
        //int y = 400;
        //int z = x + y - x*y + x/y;
        // 300 + 400 - 120000 + 0
        // 700 - 120000
        //
        //System.out.println(z);

        //byte a = 200;
        //double b = a/2.0  +  a++  +  --a *  a * 3  + 100;
        // 100 + 200 + 200 * 200 *3 + 100
        // 100 + 200 + 200 * 199 * 3 + 100
        // 300 + 119400 + 100

        long f = 3_000l;
        System.out.println(f);
        System.out.println((int)(10.0/3));

        int  x =  10;

        int  y =  x++;

        System.out.println( y++  + "  " +  x++  + "  " + y);


    }
}

/*


				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;




 */