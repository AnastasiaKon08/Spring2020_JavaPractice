package day18_NestedLoops;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(i+" ");

            }

            System.out.println();

        }

        System.out.println("===================");


        int a =1;
        while(a<=7){
        int k=1;
        while(k<=6){
            System.out.print("* ");
            k++;
        }

        System.out.println();
        a++;
    }}


}
