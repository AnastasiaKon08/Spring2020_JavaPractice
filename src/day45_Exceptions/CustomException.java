package day45_Exceptions;

class BreakTimeException extends RuntimeException{ //custom unchecked exception
    public BreakTimeException(){
        super("It's break time, you should take a break");
    }

    public BreakTimeException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        boolean breakTime = true;

        if(breakTime){
            throw new BreakTimeException("Let's have a break please");
        } else {
            System.out.println("Continue the class");
        }

      //  throw new RuntimeException("It's break time");
    }

}
