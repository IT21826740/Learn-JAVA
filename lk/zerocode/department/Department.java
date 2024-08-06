package lk.zerocode.department;

public class Department {
    public static void main(String[] args) {
        Course course2 = new Course();
        course2.getCourseDetails();
        System.out.println(course2);
        course2.fee = 500;
        course2.name = "dil";
        course2.duration = 5;
    }
}
