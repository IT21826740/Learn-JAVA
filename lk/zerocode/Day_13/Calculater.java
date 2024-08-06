package lk.zerocode.Day_13;

public class Calculater {
    int num1;

    int add( int num1,int num2){
        num1 =10;
        return (num1 + num2);
    }

    int add (int num1,int num2 ,int num3){
        return (num1 + num2 + num3);
    }

    int devide() {
       /* if (num2 != 0) {
            System.out.println("if");
            return num1 / num2;

        }
        System.out.println("else");
        //return 0;*/

        int number = 1;
        switch (number) {
            case 1: {
                System.out.println("case1");
                break;
            }
            case 2: {
                System.out.println("case2");
                break;
            }
            case 3: {
                System.out.println("case3");
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }
return 0;//?????
    }




    public static void main(String[] args) {
       Calculater c1 = new Calculater();
       int result = c1.devide();
        System.out.println("Result is : " + result);
    }

}
