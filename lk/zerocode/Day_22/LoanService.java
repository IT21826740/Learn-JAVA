package lk.zerocode.Day_22;

public class LoanService {

   boolean checkEligibility(String NIC ,double amount) {
       try {
           CustomerRepository cr = new CustomerRepository();
           cr.findByNIC(NIC);
       } catch (CustomerNotFoundException e) {
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("Final");
       }

       return true;
   }

}
