package lk.zerocode.Day_15;

public class Main {
    public static void main(String[] args) {
        HospitalStaff hs = new HospitalStaff();
        System.out.println(hs instanceof HospitalStaff);

        Doctor dr = new Doctor();
        System.out.println(dr instanceof Doctor);
        System.out.println(dr instanceof HospitalStaff);
       // System.out.println(dr instanceof SecurityStaff);
        System.out.println(hs instanceof Doctor);
    }
}
