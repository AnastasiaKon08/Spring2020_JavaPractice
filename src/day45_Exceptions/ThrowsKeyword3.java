package day45_Exceptions;

import java.io.IOException;

public class ThrowsKeyword3 {
    public static void method1() throws IOException, Exception{
        Thread.sleep(3000);
    }

    public static void main(String[] args) {
       try {
           method1();
       }catch(Exception e){}
    }

}
