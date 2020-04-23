package day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        String upper = "";
        String lower = "";

        for (char ch = 'A'; ch <= 'Z'; ch++){
            upper += ch;
        }

        System.out.println(upper);

        for (char ch = 'a'; ch<= 'z'; ch++){
            lower += ch;
        }
        System.out.println(lower);

        String result = "";

        for (int i = 0; i<= upper.length()-1; i++){
            result += upper.charAt(i) + "" + lower.charAt(i)+ " ";
        }

        System.out.println(result);
    }
}
