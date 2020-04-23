package day19_Arrays;
import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30 };

        System.out.println(arr.length); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);



        String[] testers = new String[3]; //  {"Reem", "Madina", "Osman"};
        testers[0] = "Reem";
        testers[2] = "Osman";

        System.out.println(testers[0]);
        System.out.println(testers[1]); // default value
        System.out.println(testers[2]);

        System.out.println("============================================");

        String[] students = new String[10];
        String students2 ="";

        for (int i = 0; i<= students.length-1; i++){
            System.out.println("Enter student's name");
            students[i] = input.next();
            students2+= students[i]+ " ";

        }
        System.out.println(students2);


    }
}
