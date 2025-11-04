package controlflow;

public class examplesIf {
    public static void main(String[] args) {
            int hour = 24;

            if (hour >= 0 && hour < 12){
                System.out.println("Good Morning");
            } else if (hour >= 12 && hour < 18) {
                System.out.println("Good After Noon");
            }else if (hour >= 18 || hour < 24){
                System.out.println("Good Night");
            }else {
                System.out.println("Not Correct 24 hour time format");
            }

    }
}
