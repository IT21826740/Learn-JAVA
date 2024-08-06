package lk.zerocode.Day_15;

public class Operaters {
    public static void main(String[] args) {
        System.out.println(true&false);
        System.out.println(true&true);
        System.out.println(true|false);
        System.out.println(true|true);

        System.out.println("---------------------");

        int age = 18;
        int salary = 200;

        if (++age > 18 || ++salary > 100){
            System.out.println("1: age :" + age +" salary : "+ salary);
        }
        else {
            System.out.println("2: age :" + age +" salary : "+ salary);
        }

        int x = 10;
        int y = 12;

        if (x!=y){
            System.out.println("x!=y");
        }

        if (x==10){
            System.out.println("x==10");
        }

        if (y==10){
            System.out.println("y==10");
        }
        else {
            System.out.println("y != 10");
        }
    }
}
