package lk.zerocode.Day_30;

public class MyThread extends Thread{

    public void run(){
        for(int x=0; x<=20;x++){
            System.out.println(x + " " + Thread.currentThread().getName());
        }
    }
}
