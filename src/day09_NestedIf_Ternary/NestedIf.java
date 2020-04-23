package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {


        boolean citizenship = true;
        int age =18;

        if (citizenship){
            if (age>17){
                System.out.println("You're eligible to vote");
            } else {
                System.out.println("Grow up first and then vote");
            }
        } else{
            System.out.println("You have to wait for your citizenship");
        }


        System.out.println("=======================");

        int score = 18;
        String grade = "";

        if (score >=0 && score <=100){
            if (score>=90) {
                grade = "excellent";
            } else if (score>=80){
                grade = "great";
            } else if (score>+70){
                grade = "good";
            } else if (score>=60){
                grade = "pass";
            } else{
                grade = "fail";
            }
        } else {
            grade = "Invalid";
        }
        System.out.println(grade );

        System.out.println("=======================");

        int score2 = 75;
        String grade2 = "";

        if (score2 >=0 && score2 <=100){
            grade2 = (score2>=90)? "excellent" : (score2>=80)? "great" : (score2>+70)? "good" : (score2>=60)? "pass" : "fail";
        } else {
            grade2 = "Invalid";

        }
        System.out.println(grade2);
    }
}
