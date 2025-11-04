package readingandwriting;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try ( FileReader reader = new FileReader("sample.txt")){
            int data ;
            while ((data = reader.read()) != -1) { // != -1 - file မဆုံးသမျှ loop ဆက်လက်လုပ်သည်
                System.out.print((char)data); // (char)data - integer value ကို character အဖြစ် convert လုပ်သည်
            }

        }catch (IOException e) {
            System.out.println("An I/O error occurred!");
        }
    }
}
