package lk.zerocode.Day_28;

import java.util.*;

public class ItemQueue {
    public static void main(String[] args) {
        //Comparator<Integer> com = Comparator.naturalOrder();
        Comparator<Integer> com = Comparator.reverseOrder();
        //Queue<Integer> itemsQueue = new PriorityQueue<>(com);
        Deque<Integer> itemsQueue = new ArrayDeque<>();


        itemsQueue.offer(5);
        itemsQueue.offer(3);
        itemsQueue.offer(1);
        itemsQueue.offer(25);
        itemsQueue.offer(64);
        itemsQueue.offer(6);

        System.out.println(itemsQueue);

        itemsQueue.offer(44);

        System.out.println(itemsQueue);

       /* while (!itemsQueue.isEmpty()){
            System.out.println(itemsQueue.poll());
        }*/
    }
}
