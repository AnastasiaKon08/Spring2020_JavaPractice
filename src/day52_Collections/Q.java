package day52_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {
        Queue <String> q = new PriorityQueue<>();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("D");

        System.out.println(q);

        String fifo = q.poll(); // A
        System.out.println(fifo);

        System.out.println(q);



    }
}
