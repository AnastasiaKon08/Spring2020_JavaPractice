package day39_AccessModifiers;
public class EmployeeObj {
public static void main(String[]args){
    Employee employee1 = new Employee("Nicole Rich", "SDET");
    System.out.println(employee1);

    Employee employee2 = new Employee("Mark Smith", "Developer", 45789, 150000);
    System.out.println(employee2);
    }
}
