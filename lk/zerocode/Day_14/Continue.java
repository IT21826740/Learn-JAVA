package lk.zerocode.Day_14;

public class Continue {
    public static void main(String[] args) {
        int count =0;

        while(count<10){
            System.out.println(count);
            if (count==5) {
                System.out.println("continue...");
                count++;
                continue;
            }
            System.out.println("loop" + count);
            count++;
        }
    }
}
