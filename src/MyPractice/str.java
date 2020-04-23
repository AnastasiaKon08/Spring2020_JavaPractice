package MyPractice;

public class str {
    public static void main(String[] args) {
        printStrings("abc", 5);

    }
        public static void printStrings(String str, int num) {
        for ( int i = 0; i < num ; i++){
            System.out.print(str);
        }

        }


}

/*
Write a method called printStrings that accepts a String and a number of repetitions as parameters and prints that String the given number of times. For example, the call:

printStrings("abc", 5);
will print the following output:
 */