package day36_Static_Block;

import java.util.ArrayList;

public class BankOfAzerbai {
    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();

        list.add(HumanResources.employee1);
        list.add(HumanResources.employee2);

        Employee employee3 = new Employee();
        employee3.setEmployeeInfo("Ron", 78463, 65936486, "Developer", 160000, 'm');
        list.add(employee3);
        Employee employee4 = new Employee();
        employee4.setEmployeeInfo("Helen", 56824, 246589, "Developer", 165000, 'f');
        list.add(employee4);

        for (Employee each : list){
            System.out.println(each);
            System.out.println("===========================");
        }




    }

    /*
    create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
     */
}
