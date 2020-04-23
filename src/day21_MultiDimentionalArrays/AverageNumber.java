package day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double[] arr = {10, 20, 30, 40, 50, 60, 70, 50, 40, 25};
        int length = arr.length;
        double sum = 0;

        for (int i = 0; i < length; i++) {
            double eachNum = arr[i];
            sum += eachNum;
        }
        System.out.println(sum);
        System.out.println(df.format(sum/length));
    }
}
