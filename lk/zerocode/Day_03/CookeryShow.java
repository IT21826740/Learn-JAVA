public class CookeryShow {

    static RiceCooker rice = new RiceCooker();

    public static void main(String[] args) {
        System.out.println("---------------");
        String cookedRice = rice.cookRice();
        System.out.println(cookedRice);

        System.out.println("---------------");
        System.out.println(rice.cookRice());
    }
    
    
}
