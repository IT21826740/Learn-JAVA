package lk.zerocode.department;

import lk.zerocode.employee.CourseCordinater;

public class Course {
   Department department; //create relation with department ( datatype =Department )
   AddmissionRequerment entryRequerment;
   CourseCordinater courseCordinater;

   protected int duration;
   public String name;
   float fee;

protected void getCourseDetails(){
   System.out.println("Course Info");
}
}
