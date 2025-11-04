package object;

public class simpleObject {
        public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ma Ma";
        person.age = 18;
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
    }
}
class Person {
    String name;
    int age;
}

