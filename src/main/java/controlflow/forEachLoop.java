package controlflow;

public class forEachLoop {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};
        int sum = 0;
        for (int number : num){
            sum += number;
        }
        System.out.println("Total Sum : " + sum);
    }
}
