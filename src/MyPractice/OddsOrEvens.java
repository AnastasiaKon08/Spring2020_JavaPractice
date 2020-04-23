package MyPractice;
import java.util.*;
public class OddsOrEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Давай сыграем в игру \"четное или нечетное\"");
        System.out.println("Как тебя зовут?");
        String name = input.nextLine();
        System.out.println("Привет " + name + ", что ты выберешь? Четное или нечетное?");
        String ch = input.nextLine();

        if (ch.contains("четное")) {
            System.out.println(name + ", ты выбрала четное. Я выбираю нечетное");
        } else {
            System.out.println(name + ", ты выбрала нечетное. Я выбираю четное");
        }

        System.out.println("----------------------------");

        System.out.println("Какое число ты загадаешь?");
        int finger = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("Я загадал " + computer);

        System.out.println("----------------------------");
        int sum = finger + computer;

        if (sum % 2 == 0) {
            System.out.println(finger + " + " + computer + " = " + sum);
            System.out.println("Это четное!");
            if (ch.contains("e")) {
                System.out.println("Ты выиграл!");
            } else {
                System.out.println("Я выиграл!");
            }
        } else {
            System.out.println(finger + " + " + computer + " = " + sum);
            System.out.println("Это нечетное!");
            if (ch.contains("o")) {
                System.out.println("Ты выиграл!");
            } else {
                System.out.println("Я выиграл!");
            }
            System.out.println("----------------------------");


        }
    }
}


/*
Давай сыграем в игру "четное или нечетное"
Как тебя зовут?
Привет
Что ты выберешь? Четное или нечетное?
Ты выбрала
Я выбрал
Какое число ты загадаешь?
Я выбираю
Это
Я выиграл
Ты выиграл
 */