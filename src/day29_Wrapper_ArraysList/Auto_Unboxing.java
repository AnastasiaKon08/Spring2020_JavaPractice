package day29_Wrapper_ArraysList;

public class Auto_Unboxing {
    public static void main(String[] args) {
        int a = 100;
        Integer b = a; // Autoboxing

        Byte byte1 = 98;

        short short1 = byte1; // Unboxing
        byte b2 = byte1;  // Unboxing
        int int1 = byte1;   // Unboxing

    }
}
