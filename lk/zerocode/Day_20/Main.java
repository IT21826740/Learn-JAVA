package lk.zerocode.Day_20;

//Exception handling
public class Main {
    public static void main(String[] args) {
        /*System.out.println("before");
        int x = 10/0;
        System.out.println(x);
        System.out.println("after");*/

        //Using exception handling
        int a= 10;
        int b=0;

        try{
            int y= a/b;
            System.out.println(y);
        }catch (ArithmeticException e){
            System.out.println("exception occur " + e.getMessage());
        }
        System.out.println("normal flow execution");
    }
}
