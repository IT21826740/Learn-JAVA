package lk.zerocode.DAY_21;

public class StudentService {
    void registerStudent(NewStudentInfo newStudentInfo) throws InvalidAgeException,RegistrationFeeNotSufficantExecption{
      System.out.println("method is working ");
        System.out.println(newStudentInfo.name);
        System.out.println(newStudentInfo.age);
        System.out.println(newStudentInfo.registrationFee);

        if(newStudentInfo.age<16){
            throw new InvalidAgeException("Student age :"  + newStudentInfo.age);
        }
        if(newStudentInfo.registrationFee<50000){
            throw new RegistrationFeeNotSufficantExecption("Registration fee "+ newStudentInfo.registrationFee);
        }
    }
}
