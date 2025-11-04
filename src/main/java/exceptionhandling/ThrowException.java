package exceptionhandling;

public class ThrowException {
    public static void validateNumber(int number){
        if (number < 0);{
        throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}
