package day18_NestedLoops;

public class Nested_loopPr {
    public static void main(String[] args) {
        for (int j = 10; j >=1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println("=============================");


        for (char zh ='a'; zh <='z'; zh++){
            for (char ch = 'a'; ch <= zh; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();


        }

        System.out.println("=============================");


        for (char zh ='z'; zh >='a'; zh--){
            for (char ch = 'a'; ch <= zh; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();


        }










    }
}
