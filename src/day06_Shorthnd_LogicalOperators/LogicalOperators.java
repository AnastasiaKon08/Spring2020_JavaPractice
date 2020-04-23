package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1); // false

        boolean result2 = !(10+15 > 15);
        System.out.println(result2);

        boolean result3 = !true == !false;
        System.out.println(result3);

        boolean R1 = "Corona Virus " != " End of the world" && "Toilet Paper" == "Cure"; // false
        System.out.println(R1);

        boolean r3 = 'a' == 'b'-1 && 'b'+1 == 'c';
                    // 97 == 98-1 && 98+1 == 99 ==> true
        System.out.println(r3);






    }
}
