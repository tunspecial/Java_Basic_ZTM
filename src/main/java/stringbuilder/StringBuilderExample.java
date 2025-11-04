package stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(" Hello");

        // compare using equals() method...
        System.out.println("Using equals: " + sb1.toString().equals(sb2.toString()));

        // concatenate using append() method...
        sb1.append(sb2);
        System.out.println("Concatenate: " + sb1);
        
        // Reverse using reverse() method...
        sb1.reverse();
        System.out.println("Reverse: " +  sb1);

    }
}
