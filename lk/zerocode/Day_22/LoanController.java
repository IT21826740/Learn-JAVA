package lk.zerocode.Day_22;

public class LoanController {

   void inquire(String NIC, double amount){
        LoanService ls = new LoanService();
        ls.checkEligibility(NIC,amount);
        System.out.println("eligible");
    }
}
