package day29_Wrapper_ArraysList;
import java.util.Arrays;

public class Value_Of_Methods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);

        System.out.println(a);

        double b = Integer.valueOf(str); // unboxing
        // double = Integer

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        // double = double

        double d2 = Double.valueOf(str2);
        // double = Double  (unboxing)

        System.out.println("================================");
        int z1 = 2000;
        // Long L1 =z1;
        Short sh1 = 3000;
        int z2 = sh1;



        String r1 = "TRue";
        Boolean t1 = Boolean.valueOf(r1);
        boolean t2 = Boolean.valueOf(r1);
        System.out.println(t1);
        System.out.println(t2);


        System.out.println("==================================");

        int maxNum = Integer.MAX_VALUE;

        System.out.println(maxNum);

        double max = Double.MAX_VALUE;
        System.out.println(max);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);


        byte maxNum2 = Byte.MAX_VALUE;
        System.out.println(maxNum2);
        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);

        Double[] arr = new Double[3];
        System.out.println(Arrays.toString(arr));

        char[] arr2 = new char[3];
        System.out.println(Arrays.toString(arr2));

    }

}
