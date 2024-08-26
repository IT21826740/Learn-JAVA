package lk.zerocode.Day_23;

import lk.zerocode.Day_23.Exceptions.AccountBalanceNotSufficentException;
import lk.zerocode.Day_23.Exceptions.InvalidAccountNumberException;
import lk.zerocode.Day_23.Exceptions.MinimumBalanceNotSufficentException;

public class Main {
    public static void main(String[] args) throws InvalidAccountNumberException, AccountBalanceNotSufficentException, MinimumBalanceNotSufficentException {
        AccountService accountService = new AccountService();
        accountService.transfer("789","456",7000,1000);

    }
}
