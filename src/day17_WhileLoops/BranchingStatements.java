package day17_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        // System.exit();

        for (int i = 0; i<5; i++){
            if (i%2!=0){

                System.exit(0); // STOPS THE ENTIRE PROGRAM IMMEDIATELY
                // break; - ONLY EXIT THE LOOP
                //continue; - SKIPS
            }
            System.out.println(i);

        }

        System.out.println("Task completed");
    }
}
