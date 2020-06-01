package b15_Exceptions;

import java.io.IOException;

public class ThrowChecked {
    public static void main(String[] args) {
        try {
            System.out.println("About to throw a checked exception");
            throw new IOException();
        }catch(Exception e){
            System.out.println("Exception was caught and handled");
            e.printStackTrace();
        }


    }
}
