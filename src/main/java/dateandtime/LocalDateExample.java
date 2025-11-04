package dateandtime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Local Date: " + ld);

        // my BD date
        LocalDate birthdate = LocalDate.of(1983, 11, 8);
        System.out.println("My BD Date: " + birthdate);

        // String to Date
        LocalDate sld = LocalDate.parse("1983-11-08");
        System.out.println("String to Date: "+ sld);
    }
}
