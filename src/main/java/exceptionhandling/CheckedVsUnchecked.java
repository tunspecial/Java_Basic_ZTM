package exceptionhandling;
    
public class CheckedVsUnchecked {
    public static void validateString(String input)throws EmptyStringException{
        if (input.isBlank()){
            throw new EmptyStringException("The provided string is empty!!");
            }
        }    
    }
