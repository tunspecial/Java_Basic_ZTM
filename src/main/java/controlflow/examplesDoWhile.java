package controlflow;

import java.util.Scanner;

public class examplesDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in သည် keyboard input ကိုရည်ညွှန်းပါသည်

        String input; //User ထံမှရရှိသော input ကိုသိမ်းဆည်းရန် input အမည်ရှိ String variable တစ်ခုကိုကြေညာထားပါသည်
        do {
            System.out.print("Please enter your name : ");
            input = scanner.nextLine(); //User ထည့်သွင်းသော text အား nextLine() method ဖြင့်ဖတ်ယူပါသည်
        }while (input.length() < 2);
        scanner.close();
    }
}

