package com.ashish;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n===== BANK SYSTEM MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    account = new BankAccount(accNum, name);
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                        break;
                    }
                    account.showBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
