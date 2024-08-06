package lk.zerocode.Day_14;

public class Break {

        public static void main(String[] args) {
            int count =0;

            while(count<10){
                System.out.println(count);
                if (count==5) {
                    System.out.println("continue...");
                    count++;
                    break;
                }
                System.out.println("loop" + count);
                count++;
            }
        }
}

