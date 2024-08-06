package lk.zerocode.Day_17;

public interface BankAccount {
   abstract void deposit(float amount);

   default void m(){
     System.out.println("test");
   }



}
