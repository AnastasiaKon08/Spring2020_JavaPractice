package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if (num % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        }
        // if the if statement's body is only returning value and assigning it to value then we can use ternary

        String result2 = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
        System.out.println(result2);
        System.out.println("==========================");

        int num1 =100;
        int num2 =200;
        int max = 0;

        if (num2>num1){
            max = num2;
        } else {
            max = num1;
        }

        int max2 =  (num2>num1) ? num2 : num1;

        System.out.println(max);
        System.out.println(max2);

        System.out.println("==========================");

        String str = "";
        if(true){
            str = "Hello";
        } else {
            str = "Hola";
        }
        System.out.println(str);

        String str2 = (true) ? "Hello" : "Hola";

        System.out.println(str2);

        System.out.println("==========================");

        int age = 25;
        boolean eligiblity = (age>=21)? true: false ;
        if (age>=21){
            eligiblity = true;
        } else {
            eligiblity = false;
        }

        System.out.println(eligiblity);

        System.out.println("==========================");

        int ageOfPerson = 20;
        String eligibleToVote = "";
         if (ageOfPerson>=18){
             eligibleToVote = "yes";
         } else {
             eligibleToVote = "no";
         }

         String eligibleTV = (ageOfPerson>=18)? "yes": "no";

        System.out.println(eligibleToVote);
        System.out.println(eligibleTV);





    }
}
