package lk.zerocode.Day_28;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            //List<String> dataList = new Stack<>();
            Stack<String> names = new Stack<String>();

            names.push("item1");
            names.push("item2");
            names.push("item3");
            names.push("item4");
            names.push("item5");

            System.out.println(names.pop());
            System.out.println(names.peek());

            Queue<Integer> itemQueue = new LinkedList<>();
            itemQueue.offer(1);
            itemQueue.offer(2);
            itemQueue.offer(3);
            itemQueue.offer(4);
            itemQueue.offer(5);

            System.out.println(itemQueue);
            System.out.println(itemQueue.peek());
            System.out.println(itemQueue.poll());
            System.out.println(itemQueue.peek());



        }
    }


