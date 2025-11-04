package accessmodifier;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name is :" + person.name);
        System.out.println("Age is :" + person.age);
        // System.out.println("Address is :" + person.address);//can not access private member from another class.
        System.out.println("SSN is : " + person.ssn);
    }

}
