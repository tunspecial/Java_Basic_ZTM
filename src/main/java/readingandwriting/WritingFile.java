package readingandwriting;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("writefile.txt" , true)){
            writer.write("Hello There\n");
        }catch (IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
