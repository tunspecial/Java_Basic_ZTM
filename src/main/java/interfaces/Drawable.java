package interfaces;

public interface Drawable {
    public void draw();//method signature

    default void erase(){
        System.out.println("Erasing the drawing.");
    }

    default void printInfo(){
        System.out.println("Drawable info.");
    }
}
