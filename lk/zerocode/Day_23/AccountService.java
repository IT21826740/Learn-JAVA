package lk.zerocode.Day_23;

import lk.zerocode.DAY_21.InvalidAgeException;
import lk.zerocode.Day_23.Exceptions.AccountBalanceNotSufficentException;
import lk.zerocode.Day_23.Exceptions.InvalidAccountNumberException;
import lk.zerocode.Day_23.Exceptions.MinimumBalanceNotSufficentException;

public class AccountService {
   void transfer (String fromAccount , String toAccount , float transferAmount,float minimumBalanceLimit)
           throws InvalidAccountNumberException,MinimumBalanceNotSufficentException,AccountBalanceNotSufficentException {

      AccountDAO accDAO = new AccountDAO();

      Account fromAcc = accDAO.getAccoutBy(fromAccount);
      Account toAcc = accDAO.getAccoutBy(toAccount);

      if (fromAcc == null || toAcc == null) {
         throw new InvalidAccountNumberException("One of the account numbers is invalid.");
      }

      if (fromAcc.getBalance() < transferAmount) {
         throw new AccountBalanceNotSufficentException("Insufficient balance.");
      }

      double remainingBalance =fromAcc.getBalance()-transferAmount;

      if(remainingBalance < minimumBalanceLimit){
               throw new MinimumBalanceNotSufficentException("Exceed Minimum Balance");
      }

   }
}
