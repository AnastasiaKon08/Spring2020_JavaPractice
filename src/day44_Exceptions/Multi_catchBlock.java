package day44_Exceptions;

public class Multi_catchBlock {
    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);
        }catch(ClassCastException e){
            System.out.println("Class Cast");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }

    }
}
