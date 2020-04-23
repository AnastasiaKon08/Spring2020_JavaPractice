package day09_NestedIf_Ternary;

public class NITurnary {

    public static void main(String[] args) {

        double salary = 120000;
        byte workHistory = 3;

        if (salary>=30000){
            if (workHistory>=2){
                System.out.println("You're qualified gor a loan");
            } else {
                System.out.println("You should have at least 2 years of work history");
            }
        } else {
            System.out.println("You must earn at least $30000");
        }











    }
}
