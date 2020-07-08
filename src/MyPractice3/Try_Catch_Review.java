package MyPractice3;

public class Try_Catch_Review {

    public static void main(String[] args) {

        int[] arr = new int[10];
        try {
            System.out.println(arr[9001]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
        }
    }
}

