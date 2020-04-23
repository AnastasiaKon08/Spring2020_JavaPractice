package day23_Methods;

public class uniqueValues {
    public static void main(String[] args) {

        String  [] arr = {"A", "B", "A", "C", "B", "F"}; // unique


        for (int j = 0; j<arr.length; j++) {
            int count2 = 0; // should be inside the loop !
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    count2++;

                }
            }
                if (count2 == 1) {
                    System.out.println(arr[j]);
            }
        }

        System.out.println("===========================");
/*


        for (String each2 : arr) {
        int count =0;
            for (String each : arr) {
                if (each.equals(each2)) {

                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }
        }


 */


      /*

      Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop

       */

    }
}
