package controlflow;

public class forLoop {
    public static void main(String[] args) {
        int[] number = {4,7,12,5,8,10};
        for (int i = 0 ; i < number.length ; i++ ){
            System.out.println("Value of Index : " + i + ": " + number[i]);
        }
    }
}
