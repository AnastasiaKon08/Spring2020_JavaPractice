package day09_NestedIf_Ternary;

import com.sun.security.jgss.GSSUtil;

public class nestedIf_Ternary {

    public static void main(String[] args) {
        int number = 100;
        char ch1 = ' ';
        if (number>0){
            ch1= '+';
        } else if (number<0){
            ch1 = '-';
        } else {
            ch1 = '0';
        }

        char ch2 = (number>0) ? '+' : (number<0) ? '-': '0';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1+ch2);

        System.out.println("==========================");

        byte score = 45;
        String grade = "";

        if (score>=90 && score <=100){
            grade = "excellent";
        } else if (score>=80 && score<90){
            grade = "great";
        } else if (score>=70 && score<80){
            grade = "good";
        } else if (score>=60 && score<70){
            grade = "Pass";
        } else if (score<60 && score >0){
            grade = "Failed";
        } else {
            grade = "Invalid entry";
        }

        System.out.println(grade);

        String grade2 = (score>=90 && score <=100)? "excellent" : (score>=80 && score<90)? "great" : (score>=70 && score<80)? "good"
                : (score>=60 && score<70)? "pass" : (score<60 && score >0)? "failed" : "Invalid entry";

        System.out.println(grade2);









    }
}
