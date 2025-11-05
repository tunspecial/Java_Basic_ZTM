package lambdaexpression;

@FunctionalInterface
public interface Calculator {
    int calculator(int a , int b);

    String toString() ; 

    default void print(){
        System.out.println("hi hi");
    }
}
