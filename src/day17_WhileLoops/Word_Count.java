package day17_WhileLoops;

public class Word_Count {
    public static void main(String[] args) {
        String str = "Java Java Java Java";
        int count = 0;

        while (str.contains("Java")){
            count++;
           str =  str.replaceFirst("Java", ""); // removes first Java word
        }

        System.out.println(count);
    }
}


