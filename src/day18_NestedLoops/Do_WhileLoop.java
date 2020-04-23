package day18_NestedLoops;

public class Do_WhileLoop {
    public static void main(String[] args) {
        int h = 5;

        do{
            System.out.println("Hello World"); // will be executed only once
        } while (h==0);  // condition is false


        System.out.println("==================================");

        int number = 103; // print number between the number and ~100

        while (number>=100){
            System.out.println(number);
            number--;
        }



        System.out.println("==================================");

        int num2 = 103;
        do{
            System.out.println(num2);
            num2--;
        } while (num2>=100);



    }
}
