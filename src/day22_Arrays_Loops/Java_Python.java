package day22_Arrays_Loops;


public class Java_Python {
    public static void main(String[] args) {

        String sentence = "I like java, python and javascript. Python is an easy language";
        int countJava = 0;
        int countPython = 0;
        sentence = sentence.toLowerCase();
        String[] arr = sentence.split(" ");

        for (String each: arr){                   //for (int i=0; i<arr.length; i++){
            if (each.contains("java")){
                countJava++;
            }
            if (each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);






    }
}

/* write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)

 */