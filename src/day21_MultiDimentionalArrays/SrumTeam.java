package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class SrumTeam {
    public static void main(String[] args) {
        String[] DevTeam = {"Ion", "Ana", "Alice", "Tyler"};
        String[] TestersTeam = {"James", "Mark", "Michelle", "Luke"};
        String[] PO = {"Frank", "Hanna", "Donald"};
        String[][] scrumteam = {DevTeam, TestersTeam, PO};
        scrumteam[0][2]= "Alice Jane";
        System.out.println(scrumteam[0][2]);

        String info = scrumteam[1][3];
        System.out.println(info);

        System.out.println("==================================");


        for (String eachDev :scrumteam[0]){
            System.out.println(eachDev);
        }

        System.out.println("==================================");


        for (String eachPO : scrumteam[2]){
            System.out.println(eachPO);
        }

        System.out.println("==================================");


        String trump = scrumteam[2][2];
        System.out.println(trump);

        System.out.println("==================================");

        String[] testersTeam2 = {"Sasha", "Nastya", "Lena", "Vovchik"};
        scrumteam[1] = testersTeam2;
        System.out.println(Arrays.toString(scrumteam[1]));





    }
}
