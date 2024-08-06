public class BankAccount {
   static int  totalAccounts;
   double balance;

   static int initialize(int totalAccounts) {
       totalAccounts = totalAccounts +1;
       return totalAccounts;
   }

   static int getTotalAccounts() {
       return totalAccounts;
}

   double deposit(double amount){
       balance += amount;
       return balance;
   }

   double withdraw(double amount){
       balance -= amount;
       return balance;
   }

   public double getBalance() {
       return balance;
   }


   public static void main(String[] args) {

       BankAccount account1 = new BankAccount();
       BankAccount account2 = new BankAccount();

       account1.initialize(1);
       account1.deposit(5000.00);
       account1.withdraw(2500.00);
       account1.getBalance();

       account2.initialize(1);
       account2.deposit(10000.00);
       account2.withdraw(5000.00);
       account2.getBalance();   

       System.out.println("Current Balance in Account1: " + account1.getBalance());
       System.out.println("Current Balance in Account2: " + account2.getBalance());

       System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

   }
}
