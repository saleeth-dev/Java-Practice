
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
//Day – Shopping Cart System mini project//

import java.util.Scanner;

class ShoppingCartSystem {

    static Scanner sc = new Scanner(System.in);
    static String[] items = new String[10];
    static double[] prices = new double[10];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Remove Last Item");
            System.out.println("4. Calculate Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewCart();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    calculateTotal();
                    break;
                case 5:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    static void addItem() {
        if (count >= 10) {
            System.out.println("Cart is full!");
            return;
        }

        System.out.print("Enter item name: ");
        items[count] = sc.next();

        System.out.print("Enter item price: ");
        prices[count] = sc.nextDouble();

        count++;
        System.out.println("Item added successfully!");
    }

    static void viewCart() {
        if (count == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n--- Your Cart ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - ₹" + prices[i]);
        }
    }

    static void removeItem() {
        if (count == 0) {
            System.out.println("Cart is already empty.");
            return;
        }

        count--;
        System.out.println("Last item removed.");
    }

    static void calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += prices[i];
        }
        System.out.println("Total Bill Amount: ₹" + total);
    }
}

//Day – Library Management System mini project//
import java.util.Scanner;

class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static String[] books = new String[20];
    static boolean[] issued = new boolean[20];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Thank you for using Library System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }

    static void addBook() {
        if (count >= 20) {
            System.out.println("Library is full!");
            return;
        }

        System.out.print("Enter book name: ");
        books[count] = sc.next();

        issued[count] = false;
        count++;
        System.out.println("Book added successfully!");
    }

    static void viewBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". " + books[i]);
            if (issued[i])
                System.out.println(" (Issued)");
            else
                System.out.println(" (Available)");
        }
    }

    static void issueBook() {
        viewBooks();
        if (count == 0) return;

        System.out.print("Enter book number to issue: ");
        int num = sc.nextInt();

        if (num < 1 || num > count) {
            System.out.println("Invalid book number.");
            return;
        }

        if (issued[num - 1]) {
            System.out.println("Book already issued.");
        } else {
            issued[num - 1] = true;
            System.out.println("Book issued successfully!");
        }
    }

    static void returnBook() {
        viewBooks();
        if (count == 0) return;

        System.out.print("Enter book number to return: ");
        int num = sc.nextInt();

        if (num < 1 || num > count) {
            System.out.println("Invalid book number.");
            return;
        }

        if (!issued[num - 1]) {
            System.out.println("This book was not issued.");
        } else {
            issued[num - 1] = false;
            System.out.println("Book returned successfully!");
        }
    }
}

//Day – ATM Machine Simulation mini project //
import java.util.Scanner;

class ATMSimulator {

    static Scanner sc = new Scanner(System.in);
    static int pin;
    static double balance = 0;
    static boolean isPinSet = false;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== ATM MACHINE =====");
            System.out.println("1. Set PIN");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    setPin();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    static void setPin() {
        System.out.print("Set your 4-digit PIN: ");
        pin = sc.nextInt();
        isPinSet = true;
        System.out.println("PIN set successfully!");
    }

    static void login() {
        if (!isPinSet) {
            System.out.println("Please set PIN first.");
            return;
        }

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            atmMenu();
        } else {
            System.out.println("Wrong PIN!");
        }
    }

    static void atmMenu() {
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
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
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

//Day – Todo List Manager mini project//
import java.util.Scanner;

class TodoManager {

    static Scanner sc = new Scanner(System.in);
    static String[] tasks = new String[50];
    static boolean[] completed = new boolean[50];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== TO DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markCompleted();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void addTask() {
        if (count >= 50) {
            System.out.println("Task list is full!");
            return;
        }

        System.out.print("Enter task: ");
        sc.nextLine(); // clear buffer
        tasks[count] = sc.nextLine();
        completed[count] = false;
        count++;

        System.out.println("Task added!");
    }

    static void viewTasks() {
        if (count == 0) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- TASKS ---");
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". " + tasks[i]);
            if (completed[i])
                System.out.println(" (Done)");
            else
                System.out.println(" (Pending)");
        }
    }

    static void markCompleted() {
        viewTasks();
        if (count == 0) return;

        System.out.print("Enter task number to mark done: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= count) {
            completed[num - 1] = true;
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid number.");
        }
    }

    static void deleteTask() {
        viewTasks();
        if (count == 0) return;

        System.out.print("Enter task number to delete: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= count) {
            for (int i = num - 1; i < count - 1; i++) {
                tasks[i] = tasks[i + 1];
                completed[i] = completed[i + 1];
            }
            count--;
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid number.");
        }
    }
}

// if else statement by studeing java. 

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
        double prize;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to but? ");
        word = sc.nextLine();

        System.out.print("What is the price for each? ");
        prize = sc.nextDouble();

        System.out.print("How many would you like to buy? ");
        quantity = sc.nextInt();

        total = prize * quantity;
        System.out.println(total + " " + currency);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Are you a student? (true/false):");
        isStudent = sc.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (age >= 65) {
            System.out.println("You are a senior citizen.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");    
        } else if (age < 0) {
            System.out.println("Invalid age entered.");
        } else {
            System.out.println("You are a minor.");
        }
        
        if (isStudent) {
            System.out.println("You are eligible for student discounts.");
        } else {
            System.out.println("You are not eligible for student discounts.");
        }
    }
} 

// ExpenseTracker.java
import java.util.Scanner;

class ExpenseTracker {

    static Scanner sc = new Scanner(System.in);
    static String[] titles = new String[50];
    static double[] amounts = new double[50];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    totalSpending();
                    break;
                case 4:
                    highestExpense();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void addExpense() {
        if (count >= 50) {
            System.out.println("Expense list full!");
            return;
        }

        sc.nextLine(); // clear buffer
        System.out.print("Enter expense title: ");
        titles[count] = sc.nextLine();

        System.out.print("Enter amount: ");
        amounts[count] = sc.nextDouble();

        count++;
        System.out.println("Expense added!");
    }

    static void viewExpenses() {
        if (count == 0) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("\n--- EXPENSE LIST ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " - ₹" + amounts[i]);
        }
    }

    static void totalSpending() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += amounts[i];
        }
        System.out.println("Total Spending: ₹" + total);
    }

    static void highestExpense() {
        if (count == 0) {
            System.out.println("No data available.");
            return;
        }

        double max = amounts[0];
        int index = 0;

        for (int i = 1; i < count; i++) {
            if (amounts[i] > max) {
                max = amounts[i];
                index = i;
            }
        }

        System.out.println("Highest Expense: " + titles[index] + " - ₹" + max);
    }
}

// Day – Password Generator mini project
import java.util.Random;

class PasswordGenerator {
    public static void main(String[] args) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        Random rand = new Random();

        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = rand.nextInt(chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}
// AgeCalculator.java
import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int currentYear = 2026; // change if needed
        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age + " years");
    }
}






























