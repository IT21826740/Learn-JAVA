public class MathOperations {
   
    static int add (int a, int b) {
        return a + b;
    }

    int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println(sum);

        MathOperations product = new MathOperations();
        product.multiply(10, 20);
        System.out.println(product);
    }
}
