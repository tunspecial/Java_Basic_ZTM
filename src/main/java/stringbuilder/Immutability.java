package stringbuilder;

//Understand that the original object didn’t change

public class Immutability {
    public static void main(String[] args) {
        String str = "Hello World" ;
        String upperCaseStr = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("Modifier String: " + upperCaseStr);
    }
}
