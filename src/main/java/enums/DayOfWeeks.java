package enums;

public enum DayOfWeeks {
    MONDAY("MONDAY" ,1),
    TUESDAY("TUESDAY" ,2),
    WEDNESDAY("WEDNESDAY" ,3),
    THURSDAY("THURSDAY" ,4),
    FRIDAY("FRIDAY",5),
    SATURDAY("SATURDAY" ,6),
    SUNDAY("SUNDAY" ,7);

    private final String fullName; //final - တစ်ခါတည်း assign လုပ်ပြီးရင် ပြန်ပြင်လို့မရတော့ပါ
    private final int nrofDays;

    DayOfWeeks(String fullName , int nrofDays){ //this constructor dont have access modifier.default is private
        System.out.println("In Constructor enum: " + fullName + " " + nrofDays);
        this.fullName = fullName;
        this.nrofDays = nrofDays;
    }

    public String getFullName() { //fullName variable ကို အပြင်ကနေ ရယူအသုံးပြုနိုင်ရန် public getter method
        return fullName;
    }

    public int getNrofDays() {
        return nrofDays;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY ;
    }

}
