package object;

//Pass Primitive Data Type to a Method
//Explanation:
//We can observe that the value of number did not change even after modifying it in the modifyNumber method.
// This is because Java uses pass-by-value, and the value of the primitive gets copied.

public class passbyValue {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before Number : " + number);
        modifyNumber(number);
        System.out.println("After Number : " + number);

    }

    public static void modifyNumber(int num){
        num = num * 2;
    }
}
