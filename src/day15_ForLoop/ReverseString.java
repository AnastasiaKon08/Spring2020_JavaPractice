package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Java is fun";
        int lastIndexnum = str.length()-1;

        for (int i = lastIndexnum; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
