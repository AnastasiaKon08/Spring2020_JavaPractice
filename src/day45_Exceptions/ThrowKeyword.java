package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args) throws Exception {
       NoSuchElementException obj =  new NoSuchElementException();
       /* throw obj;
        throw new NoSuchElementException();
        boolean breakTime = true;
        if (breakTime){
         throw new RuntimeException("It's break time!");
        }
        */

           throw new IOException();


    }
}
