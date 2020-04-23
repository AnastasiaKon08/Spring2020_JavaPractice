package day10_Siwtch_Scanner;

public class days {
    public static void main(String[] args) {
        int num = 3;
        String result = "";

        if (num>0 && num<8){
           result = (num==1)? "Monday" : (num ==2)? "Tuesday" : (num ==3)? "Wednesday" : (num==4)? "Thursday" : (num == 5)?
           "Friday" : (num == 6)? "Saturday" : "Sunday";
        } else {
            result = "Invalid entry";
        }
        System.out.println(result);
    }
}


/*
write a program that can display the days based on the numbers 1 ~ 7

 */