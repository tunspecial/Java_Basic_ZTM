package primitivevsobject;

public class App {
    public static void main(String[] args){
        Person person = new Person(); // 1. Object ဆောက်
        Person p = person; // 2. Reference ကူး
        person.name = "tun tun";   // 3. Data ထည့်
        System.out.println(p.name);  // 4. Output ထုတ်

    }
}
//p နဲ့ person က တူညီတဲ့ object ကိုညွှန်းနေတဲ့အတွက်၊ တစ်ခုကနေ data ပြောင်းရင် နောက်တစ်ခုကလည်း ပြောင်းသွားတာကို မြင်ရမယ်။
