package interfaces;

public interface Prey {
    void runAndHide();//Implementing classes များက ဤ method ကို override လုပ်ရမည်

    default void run(){
        System.out.println("Prey is running");
    }

}
