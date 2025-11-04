package readingandwriting;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void readfile(String filepath){
        try(FileReader reader = new FileReader("hellos.txt")){
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            }catch (IOException e){
                System.out.println("Error Reading file : " + e.getMessage());
            }
        }

    }

