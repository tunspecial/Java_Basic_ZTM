package interfaces;

public interface Predator {
    void catchAndEat(); //Abstract Methods

        default void eat(Prey p){ // defaul method fro interface.Implementing classes များက override လုပ်စရာမလို
        System.out.println("Eating: " + p.getClass().getName());
    }

    default void run(){ //the same the fault method using both interfaces.
        System.out.println("Predator is running");
    }
}