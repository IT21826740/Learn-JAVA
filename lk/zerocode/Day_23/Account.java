package lk.zerocode.Day_23;

public class Account {
  private String accountNumber;
  private float balance;
  private float minimumBalanceLimit;

    public Account(String accountNumber, float balance, float minimumBalanceLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.minimumBalanceLimit = minimumBalanceLimit;
    }

    public Account() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getMinimumBalanceLimit() {
        return minimumBalanceLimit;
    }

    public void setMinimumBalanceLimit(float minimumBalanceLimit) {
        this.minimumBalanceLimit = minimumBalanceLimit;
    }
}
