package lk.zerocode.Day_30;

public class Main {
    public static void main(String[] args) {
       String name = Thread.currentThread().getName();
        System.out.println(name);

        System.out.println("Start " + Thread.currentThread().getName());

        MyThread myT = new MyThread();
        myT.start();

        System.out.println("Completed "+ Thread.currentThread().getName());

    }
}
