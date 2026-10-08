import java.util.Scanner;
    class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }
        
        void deposit(double amount) {
        balance = balance + amount;
    }
     void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
     double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + checkBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int n = sc.nextInt();
        System.out.print("Enter account holder name: ");
        String name = sc.next();
    System.out.print("Enter initial balance: ");
        double b = sc.nextDouble();
    BankAccount a = new BankAccount(n, name, b);
        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        a.deposit(d);
        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        a.withdraw(w);
      System.out.println("Final Account Details:");
        a.displayAccount();
    }
}