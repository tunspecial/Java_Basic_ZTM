package oop;

public class Animal {
    private String sound;

    //Add a constructor to initialize the sound field in the Animal class.
    public Animal(String sound){ //Add constructor
        setSound(sound);
    }

    //Add a public getter and setter for the sound field.
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    // Create a method makeSound in the Animal class that prints the sound value using the getter.
    public void makeSound(){
        System.out.println("Animal Sound: " + getSound());
    }
}
