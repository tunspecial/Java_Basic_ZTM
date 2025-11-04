package oop;

//Create a class named Bird that inherits from Animal
public class Bird extends Animal{
    public Bird(){  
        super("Chirp");
    }
    @Override
    public void makeSound(){
        System.out.println("Bird Sound: "+ getSound());
    }

}
