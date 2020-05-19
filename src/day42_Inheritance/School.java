package day42_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Mary", 'F', "B18", 23871073);
        student2.setStudentInfo( "abide", 'F', "F45",23783597);
        student3.setStudentInfo("Tim", 'M', "T12", 736572575);


        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3));


        for (Student each: studentList){
            System.out.println(each);
        }

    }
}
