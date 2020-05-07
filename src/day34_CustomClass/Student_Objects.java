package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Student_Objects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo("Marina", "Russian", 25, 3.0, 'f', true);
        //System.out.println(student1);
        //  System.out.println("============================");

        Student student2 = new Student();
        student2.setStudentInfo("Nicole Taylor", "American", 23, 2.8, 'f', false);
        //System.out.println(student2);

        Student student3 = new Student();
        student3.setStudentInfo("Nick Taylor", "American", 24, 3.0, 'm', false);

        Student student4 = new Student();
        student4.setStudentInfo("Mark Twen", "German", 25, 2.2, 'm', false);


        System.out.println("============================");

        Student[] students = {student1, student2, student3, student4};
        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p -> p.gpa < 3.0);

        for (int i = 0; i < canGraduate.size(); i++) {
            Student each = canGraduate.get(i);
            System.out.println(each.name+ " can graduate");

        }


        System.out.println("============================");

        ArrayList<Student> canNGraduate = new ArrayList<>(Arrays.asList(students));
        canNGraduate.removeIf(p -> p.gpa >= 3.0);

        for (int i = 0; i < canNGraduate.size(); i++) {
            Student each = canNGraduate.get(i);
            System.out.println(each.name+ " cannot graduate");

        }
    }
}
