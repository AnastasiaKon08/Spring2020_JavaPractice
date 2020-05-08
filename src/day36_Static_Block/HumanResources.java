package day36_Static_Block;

public class HumanResources {
   static  String name;
   static int id;
   static long ssn;
   static String jobTitle;
   static double salary;
   static char gender;

   static Employee employee1 = new Employee();
   static Employee employee2 = new Employee();

    static {
       employee2.name = "John";
       employee2.id = 23574;
       employee2.ssn =40808635l;
       employee2.jobTitle = "Product Owner";
       employee2.salary = 150000;
       employee2.gender = 'M';

       employee1.setEmployeeInfo("Alina", 67359, 62459013, "SDET", 120000, 'f');


   }

    public static void main(String[] args) {
        System.out.println(employee1);
        System.out.println("======================");
        System.out.println(employee2);
    }


    /*
    create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

     */
}
