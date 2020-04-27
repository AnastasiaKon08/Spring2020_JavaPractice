package day29_Wrapper_ArraysList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";
        int a1 = Integer.parseInt(str); //123
        System.out.println(str+1); // Concatenation
        System.out.println(a1+1); // Addition

        byte b1 = Byte.parseByte(str); // byte 123
        System.out.println(b1);

        Integer I1 = (int)Byte.parseByte(str); // explicit casting==> Autoboxing

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        System.out.println(f1+1);

        double d1 = Double.parseDouble(str2);
        System.out.println(d1+90);

        String str3 = "9999999999";
        double num1 = Long.parseLong(str3);
        System.out.println(num1- 11111111);


        String result1 = "true";
        boolean a = Boolean.parseBoolean(result1);
        System.out.println(!a);


        String r2 = "fAlSe";
        boolean a2 = Boolean.parseBoolean(r2);
        System.out.println(!a2);

    }
}
