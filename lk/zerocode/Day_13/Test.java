package lk.zerocode.Day_13;

public class Test {
    public final static int number = 30; // access any where , can't assign values , create class memory location

    public static void main(String[] args) {

        Test t1= new Test();
        //t1.number =40; can't access; this is final variable
        System.out.println(t1.number);
    }
}
