package day16_ForLoop;

public class SumOfEven {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i ++) {
           if (i%2!=0) {
               sum += i;
           }
           // System.out.print(i);
        }
        System.out.println(sum);
    }
}

/*
write a program that can calculate the sum of all the even numbers between 1 ~ 100
 write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
 */