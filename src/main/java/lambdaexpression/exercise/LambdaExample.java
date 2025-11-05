package lambdaexpression.exercise;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator operate = ( x , y) -> (x + y);
        int sum = operate.operate(3, 3);
        System.out.println("Total Sum : " + sum);

        NumericOperator maxinum = ( x , y) -> ( x > y) ? x : y ; //to find the maximum of two integers.
        int max = maxinum.operate(5 , 6);
        System.out.println("Max : " + max ); 

        StringFormatter toUpperCase = input -> input.toUpperCase();
        String uppercaseString = toUpperCase.format("hello world!!!!!");
        System.out.println("UpperCase : " + uppercaseString);
    }
}
