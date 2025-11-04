package exceptionhandling;

public class EmptyStringException extends Exception{
    public EmptyStringException(String message){
        super(message);
    }

    public EmptyStringException(){
        super(); //super() သည် Java တွင် parent class ၏ constructor ကို ခေါ်ယူသော keyword ဖြစ်ပါသည်။
    }

    public EmptyStringException(Exception e){
        super(e);
    }
}
