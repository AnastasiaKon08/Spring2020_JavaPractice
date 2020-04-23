package day09_NestedIf_Ternary;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 56;
        String ageGroup = "";

        if (age<150 && age>0){
            ageGroup = (age<21)? "Teenager" : (age>=21 && age<55)? "Adult" : "Senior";
        } else {
            ageGroup = "Age is invalid";
        }
        System.out.println(ageGroup);




         /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */


    }
}
