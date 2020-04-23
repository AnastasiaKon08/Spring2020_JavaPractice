package day23_Methods;

public class Methods {
    public static void main(String[] args) {
        /*
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
         */
        printHello5Times();
        evenNumbers();
        System.out.println();
        oddNumbers();






    }

    public static void printHello5Times(){
        for (int i=1; i<=5; i++){
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers(){
        for (int i=1; i<+100; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        } }

    public static void oddNumbers(){
        for (int i =1; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }


}
