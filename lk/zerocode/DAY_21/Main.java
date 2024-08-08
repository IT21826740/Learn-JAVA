package lk.zerocode.DAY_21;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        NewStudentInfo newStudentInfo = new NewStudentInfo("dil",13,15000.0);
        try {
            studentService.registerStudent(newStudentInfo);
        }catch (InvalidAgeException e ){
            System.out.println( e.getMessage());
        }catch (RegistrationFeeNotSufficantExecption e){
            System.out.println(e + e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
