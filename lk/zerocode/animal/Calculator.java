package lk.zerocode.animal;

public class Calculator {

    static void add (int n1, int n2) {
        System.out.println("int version");

    }

    static int add (byte x,byte y){
        //System.out.println("byte version");
        return 0;
    }

    public static void main(String[] args) {


        byte x=30;
        int y=10;


        System.out.println("1");
       add(x,x);
        System.out.println("2");
       add(x,y);
        System.out.println("3");
       add(y,y);
    }
}
