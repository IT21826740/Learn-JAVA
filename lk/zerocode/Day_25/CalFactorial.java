package lk.zerocode.Day_25;

public class CalFactorial {
    int tot = 1;

    void cal(int n) throws InvalidNumberException {
        if (n <= 0) {
            throw new InvalidNumberException("Invalid Number : " + n);
        } else {
            for (int i = n; i > 1; i--) {
                tot = tot * i;
            }
            System.out.println("Factorial : " + tot);
        }
    }
}