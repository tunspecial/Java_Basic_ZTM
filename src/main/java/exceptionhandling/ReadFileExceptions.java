package exceptionhandling;

// import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExceptions {
    public static void main(String[] args){
        try (FileReader reader = new FileReader("sameple.txt")) {    

        } catch (FileNotFoundException e){
            System.out.println("file not found");
        } catch (IOException e){
            System.out.println("IO Problem!");
        }
        System.out.println("Done!!");
    }
}
