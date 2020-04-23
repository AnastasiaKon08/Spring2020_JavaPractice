package day10_Siwtch_Scanner;

public class NumbersToWords {

    public static void main(String[] args) {
        int n = 9;
        String str= (n==1)? "one" : (n==2)? "two" : (n==3)? "three" : (n==4)? "four":
                (n==5)? "five": (n==6)? "six" : (n==7)? "seven" : (n==8)? "eight" : (n==9)? "nine" : "invalid";

        System.out.println(str);

    }
}


// 0-9