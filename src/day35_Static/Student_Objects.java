package day35_Static;

public class Student_Objects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Muhtar";
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);
        student2.name = "Kuzzat";

        Student.printSchool();
    }
}
