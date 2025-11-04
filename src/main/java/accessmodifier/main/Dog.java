package accessmodifier.main;

import accessmodifier.animals.Animal;

public class Dog extends Animal { //Dog class သည် Animal class ကို extends လုပ်ထားတဲ့ subclass တစ်ခုဖြစ်ပြီး 
    public void printSpecies() {
        System.out.println("Species: " + species); //Different package ဖြစ်သော်လည်း subclass ဖြစ်သောကြောင့် protected member ကို access လုပ်ခွင့်ရသည်
    }

}
