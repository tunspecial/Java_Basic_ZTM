package exceptionhandling;

public class HandlingExceptions {
    public static void main(String[] args) {
        try{
            ThrowException.validateNumber(-1);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
