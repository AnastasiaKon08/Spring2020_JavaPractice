package MyPractice;

public class FisBus {
    public static void main(String[] args) {
        String result = "";
        for (int i=1; i<=30; i++){
            result += (i%3==0)? "Fiz ": (i%5==0)? "Bus " : (i%3==0 && i%5 ==0)? "FisBus ": i+ " ";
        }
        System.out.println(result);

    }
}
