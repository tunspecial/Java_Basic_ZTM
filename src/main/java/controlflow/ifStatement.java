package controlflow;

public class ifStatement {
    public static void main(String[] args) {
        int age = 18;
        double ticketPrice ;
        if (age <= 5){
            ticketPrice = 0;
        } else if (age <= 12 ) {
            ticketPrice = 5;
        } else if (age <= 18 ) {
            ticketPrice = 10;
        }else {
            ticketPrice = 15;
        }
        System.out.println("Ticket Price $ : " + ticketPrice + " $");
    }
}
