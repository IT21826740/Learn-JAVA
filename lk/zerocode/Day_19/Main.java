package lk.zerocode.Day_19;

// var - local variable type inference

public class Main {
    public static void main(String[] args) {
        int x = 10;
        var y = 12;
        var n = 13.5;
        var t = false;
        var a = "test";

        var test = new Test01();

        //Array
        int [] m = new int [5];
        System.out.println(m[3]);

        m[3]=12;
        System.out.println(m[3]);

        System.out.println(m[8]);
    }
}
