package lk.zerocode.Day_23;

import lk.zerocode.DAY_21.StudentNotRegisteredException;
import lk.zerocode.Day_23.Exceptions.InvalidAccountNumberException;

public class AccountDAO {

   Account getAccoutBy(String accountNumber) throws InvalidAccountNumberException {

       if (accountNumber.equals("123")) {
           System.out.println("Account : 123");
           return new Account("123", 5000, 1000);
       } else if (accountNumber.equals("456")) {
           System.out.println("Account : 456");
           return new Account("456", 10000, 1000);
       }
       throw new InvalidAccountNumberException("no acc");
   }

}
