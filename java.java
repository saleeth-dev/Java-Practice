import java.util.Scanner;

class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

}

\\ Day -2 Pratice \\
    
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

\\ Day - 3 Practice \\

import java.util.Scanner;

class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division not possible (divide by zero)");
        }
    }
}
\\Day 4 – Java number guessing game\\

import java.util.Random;
import java.util.Scanner;

class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed it ");
            }
        } while (guess != number);
    }
}
//Day 5 – Bank Management System mini project//

import java.util.Scanner;

class BankManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static String name;
    static int accountNumber;
    static double balance = 0;

    public static void main(String[] args) {

        System.out.println("===== Welcome to Simple Bank Management System =====");

        createAccount();

        int choice;
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our bank system!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }

    static void createAccount() {
        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.println("Account created successfully!");
    }

    static void showMenu() {
        System.out.println("\n------ MENU ------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposit successful!");
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void checkBalance() {
        System.out.println("Account holder: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: ₹" + balance);
    }
}
//StudentManagementSystem.java//

import java.util.Scanner;

class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static String name;
    static int roll;
    static int m1, m2, m3;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Calculate Result");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    calculateResult();
                    break;
                case 4:
                    System.out.println("Thank you! Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        name = sc.next();

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();

        System.out.print("Enter marks 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        m3 = sc.nextInt();

        System.out.println("Student added successfully!");
    }

    static void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
    }

    static void calculateResult() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 75)
            System.out.println("Grade: A");
        else if (avg >= 60)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}









