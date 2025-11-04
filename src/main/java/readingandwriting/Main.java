package readingandwriting;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        String sourcePatch = "source.txt";
        String destinationPath = "destination.txt";

        try {
            CopyFile.copyFile(sourcePatch, destinationPath);
            System.out.println("Files Copied successfully!!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found..!!");
        }
    }
}
