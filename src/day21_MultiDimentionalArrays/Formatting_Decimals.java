package day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); //rounding the decimals. Given in String format

        double a  = 10.0/3.0;
        System.out.println(a);
        System.out.println( df.format(a)  );
        System.out.println(df.format(2.34567));












    }
}
