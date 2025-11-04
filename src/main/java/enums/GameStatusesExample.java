package enums;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus status : GameStatus.values()){
            System.out.println(status);
        }
        // GameStatus gameStatus = GameStatus.PAUSED; //Game status တစ်ခုကို assign လုပ်ခြင်း
    
    }
}
