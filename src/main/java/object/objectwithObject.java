package object;

public class objectwithObject {
        public static void main(String[] args) {
    Person1 person = new Person1();
    person.name = "Min Min";

    Car car = new Car();
    car.model = "Toyota";
    car.owner = person;

    System.out.println("Car Model : " + car.model);
    System.out.println("Owner : " + car.owner.name);

    }
}

class Person1{
    String name;
}

class Car { // Object Containing Other Objects
    String model;
    Person1 owner;
}
