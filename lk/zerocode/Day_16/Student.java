package lk.zerocode.Day_16;

public class Student {
    int admissionNum;
    String email;
    float admissionFee;

    Student(int admissionNum){
        this.admissionNum = admissionNum;
        System.out.println(admissionNum);
    }
    Student(int admissionNum, float admissionFee){
        this (admissionNum);
        this.admissionFee = admissionFee;
        System.out.println(admissionFee);
    }
    Student(int admissionNum,String email, float admissionFee){
        this(admissionNum ,admissionFee);
        this.email = email;
        System.out.println(email);
    }
}
