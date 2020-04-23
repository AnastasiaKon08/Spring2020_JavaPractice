package day18_NestedLoops;
import java.util.Scanner;

public class FactorialNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int result = 1;
        while (num>=1){
            result *= (num);
            num--;
        }
        System.out.println(result);

    }
}

/*
write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */