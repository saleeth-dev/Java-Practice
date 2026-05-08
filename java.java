
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
//DigitalClock.java
import java.time.LocalTime;

class DigitalClock {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            LocalTime time = LocalTime.now();
            System.out.println("Current Time: " + time);

            Thread.sleep(1000); // wait 1 second
        }
    }
}

import React, { useState } from "react";

function App() {
  const [task, setTask] = useState("");
  const [tasks, setTasks] = useState([]);

  const addTask = () => {
    if (task !== "") {
      setTasks([...tasks, task]);
      setTask("");
    }
  };

  const deleteTask = (index) => {
    const newTasks = tasks.filter((_, i) => i !== index);
    setTasks(newTasks);
  };

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h2>To-Do List</h2>

      <input
        value={task}
        onChange={(e) => setTask(e.target.value)}
        placeholder="Enter task"
      />
      <button onClick={addTask}>Add</button>

      <ul>
        {tasks.map((t, i) => (
          <li key={i}>
            {t}
            <button onClick={() => deleteTask(i)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

import React, { useState } from "react";

function App() {
  const [color, setColor] = useState("white");

  const changeColor = () => {
    const colors = ["red", "blue", "green", "yellow", "purple", "orange"];
    const random = colors[Math.floor(Math.random() * colors.length)];
    setColor(random);
  };

  return (
    <div style={{ backgroundColor: color, height: "100vh", textAlign: "center" }}>
      <h1>Color Changer App</h1>
      <button onClick={changeColor}>Change Color</button>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [count, setCount] = useState(0);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Counter App</h1>
      <h2>{count}</h2>

      <button onClick={() => setCount(count + 1)}>Increase</button>
      <button onClick={() => setCount(count - 1)}>Decrease</button>
      <button onClick={() => setCount(0)}>Reset</button>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [name, setName] = useState("");

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Greeting App</h1>

      <input
        placeholder="Enter your name"
        onChange={(e) => setName(e.target.value)}
      />

      <h2>Hello {name} 👋</h2>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [name, setName] = useState("");

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Greeting App</h1>

      <input
        placeholder="Enter your name"
        onChange={(e) => setName(e.target.value)}
      />

      <h2>Hello {name} 👋</h2>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [result, setResult] = useState(0);

  const add = () => setResult(Number(num1) + Number(num2));
  const sub = () => setResult(Number(num1) - Number(num2));
  const mul = () => setResult(Number(num1) * Number(num2));
  const div = () => setResult(Number(num1) / Number(num2));

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Calculator</h1>

      <input
        type="number"
        placeholder="First number"
        onChange={(e) => setNum1(e.target.value)}
      />

      <input
        type="number"
        placeholder="Second number"
        onChange={(e) => setNum2(e.target.value)}
      />

      <br /><br />

      <button onClick={add}>+</button>
      <button onClick={sub}>-</button>
      <button onClick={mul}>*</button>
      <button onClick={div}>/</button>

      <h2>Result: {result}</h2>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [city, setCity] = useState("");
  const [weather, setWeather] = useState("");

  const checkWeather = () => {
    if (city.toLowerCase() === "bangalore") setWeather("Sunny ☀️");
    else if (city.toLowerCase() === "mumbai") setWeather("Rainy 🌧️");
    else if (city.toLowerCase() === "delhi") setWeather("Cloudy ☁️");
    else setWeather("Weather not found");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Weather App</h1>

      <input
        placeholder="Enter City"
        onChange={(e) => setCity(e.target.value)}
      />

      <button onClick={checkWeather}>Check</button>

      <h2>{weather}</h2>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [note, setNote] = useState("");
  const [notes, setNotes] = useState([]);

  const addNote = () => {
    if (note !== "") {
      setNotes([...notes, note]);
      setNote("");
    }
  };

  const deleteNote = (index) => {
    const newNotes = notes.filter((_, i) => i !== index);
    setNotes(newNotes);
  };

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h1>Notes App</h1>

      <input
        value={note}
        onChange={(e) => setNote(e.target.value)}
        placeholder="Enter note"
      />

      <button onClick={addNote}>Add</button>

      <ul>
        {notes.map((n, i) => (
          <li key={i}>
            {n}
            <button onClick={() => deleteNote(i)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [search, setSearch] = useState("");

  const names = ["Saleeth", "John", "Aisha", "David", "Ravi", "Sara"];

  const filtered = names.filter(name =>
    name.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h1>Search Filter App</h1>

      <input
        placeholder="Search name"
        onChange={(e) => setSearch(e.target.value)}
      />

      <ul>
        {filtered.map((name, i) => (
          <li key={i}>{name}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [dark, setDark] = useState(false);

  const toggleTheme = () => setDark(!dark);

  const style = {
    backgroundColor: dark ? "#222" : "#fff",
    color: dark ? "#fff" : "#000",
    height: "100vh",
    textAlign: "center",
    paddingTop: "50px"
  };

  return (
    <div style={style}>
      <h1>{dark ? "Dark Mode" : "Light Mode"}</h1>
      <button onClick={toggleTheme}>
        Switch Theme
      </button>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [search, setSearch] = useState("");

  const names = ["Saleeth", "John", "Aisha", "David", "Ravi", "Sara"];

  const filtered = names.filter(name =>
    name.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h1>Search Filter App</h1>

      <input
        placeholder="Search name"
        onChange={(e) => setSearch(e.target.value)}
      />

      <ul>
        {filtered.map((name, i) => (
          <li key={i}>{name}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [city, setCity] = useState("");
  const [weather, setWeather] = useState("");

  const checkWeather = () => {
    if (city.toLowerCase() === "bangalore") setWeather("Sunny ☀️");
    else if (city.toLowerCase() === "mumbai") setWeather("Rainy 🌧️");
    else if (city.toLowerCase() === "delhi") setWeather("Cloudy ☁️");
    else setWeather("Weather not found");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Weather App</h1>

      <input
        placeholder="Enter City"
        onChange={(e) => setCity(e.target.value)}
      />

      <button onClick={checkWeather}>Check</button>

      <h2>{weather}</h2>
    </div>
  );
}

export default App;

import React, { useState } from "react";

function App() {
  const [dark, setDark] = useState(false);

  const toggleTheme = () => setDark(!dark);

  const style = {
    backgroundColor: dark ? "#222" : "#fff",
    color: dark ? "#fff" : "#000",
    height: "100vh",
    textAlign: "center",
    paddingTop: "50px"
  };

  return (
    <div style={style}>
      <h1>{dark ? "Dark Mode" : "Light Mode"}</h1>
      <button onClick={toggleTheme}>
        Switch Theme
      </button>
    </div>
  );
}

export default App;

// todays project practeice

import java.util.Scanner;

class VotingSystem {

    static Scanner sc = new Scanner(System.in);
    static int candidate1 = 0;
    static int candidate2 = 0;
    static int candidate3 = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== VOTING SYSTEM =====");
            System.out.println("1. Vote for Candidate 1");
            System.out.println("2. Vote for Candidate 2");
            System.out.println("3. Vote for Candidate 3");
            System.out.println("4. Show Results");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    candidate1++;
                    System.out.println("Voted for Candidate 1");
                    break;
                case 2:
                    candidate2++;
                    System.out.println("Voted for Candidate 2");
                    break;
                case 3:
                    candidate3++;
                    System.out.println("Voted for Candidate 3");
                    break;
                case 4:
                    showResults();
                    break;
                case 5:
                    System.out.println("Voting ended.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void showResults() {
        System.out.println("\n--- Voting Results ---");
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
        System.out.println("Candidate 3: " + candidate3 + " votes");
    }
}

const http = require("http");

const server = http.createServer((req, res) => {

  if (req.url === "/") {
    res.writeHead(200, { "Content-Type": "text/plain" });
    res.end("Welcome to My Node Server 🚀");
  }

  else if (req.url === "/about") {
    res.writeHead(200, { "Content-Type": "text/plain" });
    res.end("This is About Page");
  }

  else if (req.url === "/api") {
    res.writeHead(200, { "Content-Type": "application/json" });
    res.end(JSON.stringify({
      name: "Saleeth",
      role: "Full Stack Student",
      status: "Learning Node.js"
    }));
  }

  else {
    res.writeHead(404, { "Content-Type": "text/plain" });
    res.end("Page Not Found ❌");
  }

});

server.listen(3000, () => {
  console.log("Server running at http://localhost:3000");
});

import java.util.Scanner;

class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " - " + marks[i] + " - Grade: ");

            if (marks[i] >= 75)
                System.out.println("A");
            else if (marks[i] >= 60)
                System.out.println("B");
            else if (marks[i] >= 50)
                System.out.println("C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}


import java.util.Scanner;

class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } 
        else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);

        sc.close();
    }
}


import java.util.Scanner;

class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}


import java.util.Random;
import java.util.Scanner;

class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Press Enter to roll the dice...");
        sc.nextLine();

        int user = rand.nextInt(6) + 1;
        int computer = rand.nextInt(6) + 1;

        System.out.println("You rolled: " + user);
        System.out.println("Computer rolled: " + computer);

        if (user > computer) {
            System.out.println("You Win! 🎉");
        } else if (user < computer) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("It's a Draw!");
        }

        sc.close();
    }
}


import java.util.Scanner;

class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

import java.util.Scanner;

class ATMSystem {

    static Scanner sc = new Scanner(System.in);
    static int pin = 1234;
    static double balance = 1000;

    public static void main(String[] args) {

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong PIN ❌");
            return;
        }

        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    balance += dep;
                    System.out.println("Deposit successful!");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();

                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println("Please collect cash 💵");
                    } else {
                        System.out.println("Insufficient balance ❌");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}


import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = ₹" + si);

        sc.close();
    }
}

import java.util.Scanner;

class AddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = ₹" + si);

        sc.close();
    }
}

import java.util.Scanner;

class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " - " + marks[i] + " - Grade: ");

            if (marks[i] >= 75)
                System.out.println("A");
            else if (marks[i] >= 60)
                System.out.println("B");
            else if (marks[i] >= 50)
                System.out.println("C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double circonference;
        double area;
        double volume;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        circonference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The circumference of the circle is: %.2fcm\n", circonference);
        System.out.printf("The area of the circle is: %.2fcm²\n", area);
        System.out.printf("The volume of the sphere is: %.2fcm³\n", volume);

        sc.close();
    }
}

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "muhammed saleeth    ";

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf(" ");
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("mahammed", "ahmed");


        System.out.println("Length of the name: " + length);
        System.out.println("Letter at index 2: " + letter);
        System.out.println("Index of the name: " + index);
        System.out.println("Name in uppercase: " + name.toUpperCase());
        System.out.println("Name in lowercase: " + name.toLowerCase());
        System.out.println("Name after trimming: '" + name.trim() + "'");
        System.out.println("Name after replacement: '" + name.replace("mahammed", "ahmed") + "'");
        sc.close();
    }
    }


import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("How many foods do you want to enter? ");
        size = sc.nextInt(); // Consume the newline character
        sc.nextLine(); // Consume the newline character after nextInt()
        
        foods = new String[size];

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }
        for(String food : foods) {
            System.out.println(food);
        }

        sc.close();

    }
}

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, int number, double bal) {
        accountHolder = name;
        accountNumber = number;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw method
    void withdraw(double amount) {

        if(amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display method
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount b1 =
            new BankAccount("Saleeth", 12345, 5000);

        b1.deposit(2000);

        b1.withdraw(1000);

        b1.display();
    }
}


class Printer {

    void print(int n){
        System.out.println("Printing integer: " + n);
    }

    void print(String text){
        System.out.println("Printing text: " + text);
    }

    void print(double d){
        System.out.println("Printing decimal: " + d);
    }
}





















