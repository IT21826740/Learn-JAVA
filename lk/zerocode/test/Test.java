package lk.zerocode.test;

import lk.zerocode.employee.Lecturer;

public class Test {
    public static void main(String[] args) {
        Lecturer l2 = new Lecturer();
        l2.name="aa";
       // l2.country="bbb"; can't access


        System.out.println(l2.name);


    }
}
