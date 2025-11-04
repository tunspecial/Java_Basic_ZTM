package enums;

public class BasicEnumsExample {
    public static void main(String[] args) {
        for (Weekday day : Weekday.values()){ //Weekday.values() - Enum ထဲက value အားလုံးကို array အဖြစ်ပြန်ပေးတယ်
            System.out.println(day);
        }
    }
}
