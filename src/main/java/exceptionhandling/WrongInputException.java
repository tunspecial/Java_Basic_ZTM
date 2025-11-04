package exceptionhandling;

public class WrongInputException extends Exception {
    //no args 
    public WrongInputException(){
        super();
    }

    //accepts with String  Message
    public WrongInputException(String message){
        super(message);
    }

    //accepts another exception
    public WrongInputException(Exception e){
        super(e);
    }
}
