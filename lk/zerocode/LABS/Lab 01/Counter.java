//ex1-------------------------------

public class Counter{
    
    static int staticCounter;
    int  nonStaticCounter ;

    void setStaticCount(int num){
        staticCounter = num;
    }

    void setNonStaticCount(int num){
        nonStaticCounter = num;
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2= new Counter();

        counter1.nonStaticCounter =30;
        counter1.staticCounter = 45;
        
        counter2.nonStaticCounter = 65;
        counter2.staticCounter = 75;
        

        System.out.println(counter1.staticCounter);
        System.out.println(counter1.nonStaticCounter);

        System.out.println(counter2.staticCounter);
        System.out.println(counter2.nonStaticCounter);

    }
}