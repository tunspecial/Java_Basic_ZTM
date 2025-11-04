package controlflow;

public class forEachLoopControl {
    public static void main(String[] args) {
        int [] number = {4,7,12,5,8,9};
        int sum = 0 ;
        int count = 0;
        for (int num : number){
            if (num % 2 != 0){
                sum += num; //sum = sum + num;
                count++;
            }
        }
        //sum = 7 + 5 = 12
        //count = 2
        //average = 12 / 2 = 6.0
        double average = (double) sum / count;
        System.out.println("Average of odd number : " + average);
    }
}
