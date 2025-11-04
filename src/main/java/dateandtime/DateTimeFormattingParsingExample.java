package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        //format a localdatatime object
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Time & Time: " + formattedDateTime);


        //Parse a data string into a locadata object
        String dateString = "2024-11-20";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString,dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
