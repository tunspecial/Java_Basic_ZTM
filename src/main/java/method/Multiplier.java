package method;

public class Multiplier {
    public static void main(String[] args) {
        int product = multiply(3, 7); // calling method multiply
        System.out.println("Product : " + product);
    }

    public static int multiply(int a , int b){ // with return type method
        return a * b ;

    }

}
