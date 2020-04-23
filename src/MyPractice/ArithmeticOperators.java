package MyPractice;

public class ArithmeticOperators {

    public static void main(String[] args) {

       int num1 = 1897651;

       boolean oddNumber = num1 % 2 != 0;
        System.out.println(oddNumber);

        boolean evenNumber = num1 %2 == 0;

        boolean divisibleBy3 = num1 % 3 == 0;
        

        System.out.println("The number " + num1 + " is odd number: " + oddNumber );
        System.out.println("The number " + num1 + " is even number: " + evenNumber);







    }
}
