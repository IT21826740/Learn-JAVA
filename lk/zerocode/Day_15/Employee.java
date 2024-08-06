package lk.zerocode.Day_15;

public class Employee extends Object {
    String designation;

    public boolean equals(Employee obj) {
        return this.designation.equals(obj.designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = emp1;

        System.out.println(emp1 == emp2);

        emp1.designation="CEO";
        emp2.designation="CEO";

        System.out.println(emp1 == emp2);
        System.out.println(emp1 == emp3);

        System.out.println(emp1.equals(emp2));


    }
}
