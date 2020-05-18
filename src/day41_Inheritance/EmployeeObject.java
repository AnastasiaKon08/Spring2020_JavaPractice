package day41_Inheritance;

public class EmployeeObject {


    public static void main(String[] args) {


        Developer developer = new Developer("Steve Jobs", 160000, 837560867, "Developer", 'M');
        Tester tester = new Tester("Jack Hawk", 130000, 38562633, "SDET", 'M');

        developer.coding();
        tester.reportingBug();
        developer.fixingBug();
        tester.testing();

        System.out.println("=====================");

        System.out.println(developer);
        System.out.println(tester);


    }
}