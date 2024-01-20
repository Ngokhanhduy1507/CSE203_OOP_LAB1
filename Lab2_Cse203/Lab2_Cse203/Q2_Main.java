/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Q2_Main {
   static Scanner scanner = new Scanner(System.in);
    static ArrayList<Q2__BankAccount> bankAccounts = new ArrayList<>();

    public static void main(String[] args) {
        bankAccounts = inputAccounts();
        printAccounts();
        int s = 0;
        do {
            printMenu();
            boolean res;
            s = scanner.nextInt();
            switch (s) {
                case 1 -> {
                    res = deposit();
                    if (res) {
                        System.out.println("Successfully");
                    } else System.out.println("Unsuccessfully");
                }
                case 2 -> {
                    res = withdraw();
                    if (res) {
                        System.out.println("Successfully");
                    } else System.out.println("Unsuccessfully");
                }
                case 3 -> {
                    res = transfer();
                    if (res) {
                        System.out.println("Successfully");
                    } else System.out.println("Unsuccessfully");
                }
                case 4 -> {
                    printAccount();
                }
                default -> {
                }
            }
        } while (s > 0 && s < 5);
    }

    public static ArrayList<Q2__BankAccount> inputAccounts() {
        System.out.print("Number of accounts: ");
        int numberAccounts = scanner.nextInt();
        for (int i = 0; i < numberAccounts; i++) {
            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
            Q2__BankAccount temp = new Q2__BankAccount(accNum, balance);
            bankAccounts.add(temp);
        }
        return bankAccounts;
    }

    public static void printAccounts() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List of accounts:\n");
        for (int i = 0; i < bankAccounts.size(); i++) {
            stringBuilder.append(i + 1).append("\t").append(bankAccounts.get(i).getAccNum()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void printMenu() {
        System.out.print("------------------\n1. Deposit\n2. Withdraw\n3. Transfer\n4. Print an account\n---------------\nEnter the number as the service? ");
    }

    public static boolean deposit() {
        System.out.println("Enter the account number: ");
        int accNum = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double deposit = scanner.nextDouble();
        for (Q2__BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccNum() == accNum) {
                return bankAccount.depositMoney(deposit);
            }
        }
        return false;
    }

    public static boolean withdraw() {
        System.out.println("Enter the account number: ");
        int accNum = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double withdraw = scanner.nextDouble();
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getAccNum() == accNum) {
                return bankAccounts.get(i).withdrawMoney(withdraw);
            }
        }
        return false;
    }

    public static boolean transfer() {
        System.out.println("Enter the first account number: ");
        int accA = scanner.nextInt();
        System.out.println("Enter the second account number: ");
        int accB = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        int size = bankAccounts.size();
        int a = size, b = size;
        for (int i = 0; i < size; i++) {
            if (bankAccounts.get(i).getAccNum() == accA) {
                a = i;
            }
            if (bankAccounts.get(i).getAccNum() == accB) {
                b = i;
            }
        }
        if (a != size && b != size && a != b) {
            if (bankAccounts.get(a).withdrawMoney(amount)) {
                return bankAccounts.get(b).depositMoney(amount);
            }
            return false;
        }
        return false;
    }

    public static void printAccount() {
        System.out.println("Enter the account number: ");
        int accNum = scanner.nextInt();
        for (Q2__BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccNum() == accNum) {
                System.out.println(bankAccount.balance + "\t" + bankAccount.accNum);
            }
        }
    }
}
 




