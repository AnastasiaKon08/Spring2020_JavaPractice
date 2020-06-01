package day46_final_abstract;

import day37_Constractors_.InstanceBlock;

public class Final_Variable {

    final int InstanceVariable = 300;
    final int InstanceVariable2 = 236;

   final  static int StaticVariable = 1008;


    public static void main(String[] args) {

        final double pi = 3.14;

        final String gender = "Female";

        final int score;
        score = 100; // final value

        System.out.println("============================");

        Final_Variable obj = new Final_Variable();

        System.out.println(obj.InstanceVariable);

        // StaticVariable = 2000;

    }
}
