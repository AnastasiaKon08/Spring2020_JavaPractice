package day24_Methods_Continue;

public class Warm_Up {

    public static void MaxNum(int a, int b){
        if (a>b){
            System.out.println("Maximum number is " + a);
        } else {
            System.out.println("Maximum number is " +b);
        }
    }

    public static void Calculation(int a, int b, char ch){
        switch (ch){
            case '-' :
                System.out.println(a-b);
                break;
            case '+' :
                System.out.println(a+b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void Palindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse+= str.charAt(i); }
            if (reverse.equalsIgnoreCase(str)){
                System.out.println("It's palindrome!");
            } else {
                System.out.println("It is not a palindrome!");
            }

    }

    public static void main(String[] args) {
        int a= 67;
        int b = 33;
        String str = "";

        MaxNum(a, b);
        Calculation(a, b, '*');
        Palindrome(str);

    }
}


/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */