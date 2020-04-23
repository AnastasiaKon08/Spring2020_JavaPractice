package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        String resultOdd = "";
        for (int i =1; i<=100; i+=2) {
          //  System.out.print(i+", ");
            resultOdd += i+ " "; // resultodd + i + " ";
        }
        System.out.println(resultOdd);

        String resultEven = "";

        for (int j= 2; j<=100; j+=2 ){
            resultEven += j+ " ";
        }
        System.out.print(resultEven);












    }
}
