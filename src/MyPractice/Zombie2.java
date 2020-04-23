package MyPractice;
import java.util.*;
public class Zombie2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int num = 0;
        int[] ext = new int[8];
        int[] arr = new int[8];
        System.out.println("Day " + num + " " + Arrays.toString(inhabitants));
        while (!Arrays.equals(inhabitants, ext)) {
            for (int j = 0; j < inhabitants.length; j++) {
                arr[j] =inhabitants[j]/=2;
                num++;
            }
            System.out.println("Day " + num + " " + Arrays.toString(arr));
        }
    }
    }


/*

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
 */
