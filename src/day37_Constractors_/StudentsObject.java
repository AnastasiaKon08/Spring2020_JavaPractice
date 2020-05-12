package day37_Constractors_;

import day34_CustomClass.Student;

public class StudentsObject {

    public static void main(String[] args) {

        Students student1 = new Students("Nancy Jones", 26, 'F', "Cybertek");
        System.out.println(student1);

        Students student2 = new Students("Leo Dicaprio", 39, 'M', "LA");
        System.out.println(student2);
    }
}
