public class A {
    int x;
    static int y;

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println(a1.x);
        System.out.println(a2.x);

        System.out.println("------------");

        a1.x=10;
        a1.y=20;

        System.out.println(a1.x);
        System.out.println(a1.y);
  
        a2.x=15;
        a2.y=25;

        System.out.println(a2.x);
        System.out.println(a2.y);

        System.out.println("---------------");

        System.out.println(a1.x);
        System.out.println(a1.y);

        System.out.println(a2.x);
        System.out.println(a2.y);

    }
   
}
