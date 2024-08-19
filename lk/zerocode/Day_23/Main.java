package lk.zerocode.Day_23;

import lk.zerocode.Day_23.Exceptions.InvalidAccountNumberException;

public class Main {
    public static void main(String[] args) throws InvalidAccountNumberException {
        AccountService accountService = new AccountService();
        accountService.transfer("789","456",7000);

    }
}
