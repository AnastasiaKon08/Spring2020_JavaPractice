package day49_Polymorphism_Inro;

import day20_ArraysContinue.ArraysToString;

import java.util.Arrays;

public abstract class Employee {
    String name;
    long id;
    String jobTitle;
    double salary;

    abstract  void work();

}

class Tester extends Employee{

    public Tester(String name, long id, String jobTitle, double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
    }

    void work(){
        System.out.println(name + " is testing the application");
    }
}

class Developer extends Employee{
    public Developer (String name, long id, String jobTitle, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void work(){
        System.out.println(name + " is developing the application");
    }
}

class ScrumTeam{
    public static void main(String[] args) {
        Employee tester = new Tester("rty", 7864387569l, "QA", 150000);
        Employee developer = new Developer("ytr", 86359067l, "SDET", 87354);
        Employee tester1 = new Tester("rtyihh", 7864569l, "QA", 157000);
        Employee developer1 = new Developer("ybhtr", 863567l, "SDET", 89354);

        Employee[] scrumTeam = {tester, tester1, developer, developer1};
        System.out.println(Arrays.toString(scrumTeam));
    }
}


/*


task:
    1. create an abstract class named Employee:
            attributes: name, id, jobTitle, Salary,...
            abstract method: work()

    2. create class named Tester that inherits from emplyee

    3. create class named Developer that inherits from emplyee


    4. create a class named ScrumTeam:
            create an arraylist and store 3 testers and 4 developers
 */