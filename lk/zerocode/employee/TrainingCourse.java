package lk.zerocode.employee;

import lk.zerocode.department.Course;

public class TrainingCourse extends Course {
    public static void main(String[] args) {
        Course course1 = new Course();
        //course1.getCourseDetails();
       // System.out.println(course1.getCourseDetails);

        TrainingCourse t1 = new TrainingCourse();
        t1.getCourseDetails();
        System.out.println(t1);
        t1.duration=5;
        t1.name="dil";
       // t1.fee=500.0; can't access / default -> only package
    }
}

