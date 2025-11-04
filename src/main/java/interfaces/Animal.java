package interfaces;

public abstract class Animal {

    private double weight ;

    public void eat(){
        System.out.println("Animal eating");
    }

    public abstract void breathe();//Abstract Method

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
