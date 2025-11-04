package object;

public class objectReference {
        public static void main(String[] args) {
        Person2 person = new Person2();
        person.name = "Zaw Zaw";
        person.age = 42;

        System.out.println("Before person : " + person.name + ", " + person.age);
        updatePerson(person);
        System.out.println("After person : " + person.name + ", " + person.age);
    }
    public static void updatePerson(Person2 p){ // reference value is copied to parameter p
        p.name = "Mya Mya";
        p.age = 27 ;
    }
}

class Person2{
    String  name ;
    int age ;
}
