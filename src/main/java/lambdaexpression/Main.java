package lambdaexpression;

public class Main {
    public static void main(String[] args) {

        Calculator c1 = ( x, y ) -> (x + y);
        System.out.println(c1.calculator(3, 10));

        Calculator c2 = (x , y) -> (x-y);
        System.out.println(c2.calculator(10, 5));
        Calculator c3 = (x , y) -> {
            System.out.println("Hello from Lamda Expression");
            return x * y ;
        };
        System.out.println(c3.calculator(10, 20));

        Printer p1 = (s) -> System.out.println("Printer Say : " + s);
        p1.print("Hello");

        NumberProvider np1 = () -> 42;
        System.out.println(np1.number());

        int result1 = execute(3, 3, c1);
        int result2 = execute(4, 4, c2);
        int result3 = execute(5, 5, c3);

        int result4 = execute(3, 4, new CalculatorImple());
        int result5 = execute(3, 5, (x , y) ->( x/y));

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }
    public static int execute (int nu1 , int nu2 , Calculator calculator){
        return calculator.calculator(nu1, nu2);
    }
}
