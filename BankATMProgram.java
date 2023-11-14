//ATM Interface

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount userAcc;

    public ATM(BankAccount account) {
        this.userAcc = account;
    }

    public void Menu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void Transaction(int choice, Scanner sc) {
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                withdraw(sc);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Current balance: " + userAcc.getBalance());
    }

    private void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amt = sc.nextDouble();
        userAcc.deposit(amt);
    }

    private void withdraw(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();
        userAcc.withdraw(amt);
    }
}

public class BankATMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BankAccount userAcc = new BankAccount(20000.0);
        ATM atm = new ATM(userAcc);

        while (true) {
            atm.Menu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            atm.Transaction(choice, sc);
        }
    }
}
