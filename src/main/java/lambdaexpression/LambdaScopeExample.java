package lambdaexpression;

public class LambdaScopeExample {
    public static void main(String[] args) {
        int localVar = 6 ;
        Calculator calculator = ( x , y )-> x * y + localVar;
        int result = calculator.calculator(3, 5);
        System.out.println(result);
    }
}
