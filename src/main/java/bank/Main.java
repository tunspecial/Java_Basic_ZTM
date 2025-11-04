package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 12345;
        account.accountHolder = "tun tun";
        account.balance = 100.00;

        System.out.println("Account Number : " + account.accountNumber);
        System.out.println("Account Holder : " + account.accountHolder);
        System.out.println("Account Balance : " + account.balance);

    }
}
