package Resources;
import java.time.LocalTime;
import java.util.*;

public class timeConversion {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {
            LocalTime time1 = LocalTime.of(Integer.parseInt(s.substring(0,2)), Integer.parseInt(s.substring(3,5)), Integer.parseInt(s.substring(6,8)));
            System.out.println(time1);
            // char[] arr = s.toCharArray();




        }
    }

