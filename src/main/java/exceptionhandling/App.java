package exceptionhandling;

public class App {
     public static void main(String[] args) {
        try{
            print("Hello Everybody");
        }catch (WrongInputException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done!!");
    }


public static void print(String s) throws WrongInputException{
    if (s.length() < 11){
        System.out.println(s);
    }else{
        throw new WrongInputException("The String is too long!!");
        }
    }
}
