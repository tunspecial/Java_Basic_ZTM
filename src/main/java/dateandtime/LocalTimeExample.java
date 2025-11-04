package dateandtime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(20, 30);
        System.out.println("My set Time: " + lt);

        LocalTime nlt = LocalTime.now();
        System.out.println("Now Time: " + nlt);
    }
}

// 11:23:09.765069100
// │   │   │ └── Nanoseconds (နာနိုစက္ကန့် - ၁ စက္ကန့်၏ ဘီလီယံတစ်ပုံတစ်ပုံ)
// │   │   └── Milliseconds (မီလီစက္ကန့် - ၁ စက္ကန့်၏ တစ်ထောင်ပုံတစ်ပုံ)
// │   └── Seconds (စက္ကန့်)
// └── Minutes (မိနစ်) & Hours (နာရီ)