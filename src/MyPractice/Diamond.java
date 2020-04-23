package MyPractice;

public class Diamond {
    public static void main(String[] args) {

        String stars = "";
        String empty = "";
        int last =0;
        //for (int k = 0; k <= 9; k++) {
        for (int j = 0; j <=5; j++) {
            for (int i = 5; i >= j; i--) {
                System.out.print(" ");
            }

            stars+= "*";
            System.out.println(stars);
        }

        for (int j = 5; j >=0; j--) {
            for (int i = 0; i<=j ; i++) { // 0
                System.out.print(" ");   //


            }

            System.out.println(stars.substring(0,stars.length()-1));
        }
    }
}
  //  }
