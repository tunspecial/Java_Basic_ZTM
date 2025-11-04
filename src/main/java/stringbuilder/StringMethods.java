package stringbuilder;

public class StringMethods {
    public static void main(String[] args) {
        
        String str = "Hello World";
        System.out.println("Length: " +  str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0,5): " + str.substring(0, 11));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

    }

}
