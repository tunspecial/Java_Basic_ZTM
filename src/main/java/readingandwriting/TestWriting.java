package readingandwriting;

import java.io.FileNotFoundException;

public class TestWriting {
    public static void main(String[] args) {
     String filepath = "testing.txt";
     String[]  names = {"ko ko" , "ma ma" , "zaw zaw"};
    try {
        WriteToFile.writeNames(filepath, names);
    } catch (FileNotFoundException e) {
        System.out.println("Error Writing file : " + e.getMessage());
    }
    System.out.println("File Writing complete! : " + filepath );

    }
}
