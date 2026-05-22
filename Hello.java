import java.util.Scanner;

class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful ");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials! Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked ");
        }

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

class ContactManager {

    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[50];
    static String[] phones = new String[50];
    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== CONTACT MANAGER ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }

    static void addContact() {
        System.out.print("Enter name: ");
        names[count] = sc.next();

        System.out.print("Enter phone: ");
        phones[count] = sc.next();

        count++;
        System.out.println("Contact added!");
    }

    static void viewContacts() {
        if (count == 0) {
            System.out.println("No contacts found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - " + phones[i]);
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String search = sc.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + names[i] + " - " + phones[i]);
                return;
            }
        }

        System.out.println("Contact not found.");
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
            System.out.println("You Win! ");
        } else if (user < computer) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("It's a Draw!");
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

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature:");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.2f %s", newTemp, unit);

        sc.close();

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        boolean isFound = false;
        String target;
        
        System.out.println("Enter a target fruit to search for:");
        target = sc.nextLine();
        

        for(int i = 0; i < fruits.length; i++) {
                if(fruits[i].equals(target)) {
                    System.out.println("Target found at index: " + i);
                    isFound = true;
                    break;
                }
            }

            if(!isFound) {
                System.out.println("Target not found in the array.");

            }   


            sc.close();
        }
    }

abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args){

        Dog d1 = new Dog();

        d1.sound();
    }
}

abstract class Employee {
    abstract void salary();
}
class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary is 80000");
    }
}
public class Main {
    public static void main(String[] args){
       Employee e1 = new Manager ();
       e1.salary();
        
       
    }
}

import java.util.*;
class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public double calaculateSalary(){
        return salary;
    }
}
class Developer extends Employee {
    private double bonus;

    Developer(String name, double salary, double bonus) {

        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calaculateSalary() {
        return getSalary() + bonus;
    }
}

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        Employee d1 = new Developer(name, salary, bonus);

        System.out.println("Name: " + d1.getName());
        System.out.println("Total Salary: " + d1.calaculateSalary());
        
        sc.close();
    }
}
        
import java.util.Scanner;

class ShoppingBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("\n===== SHOPPING BILL =====");
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Total Bill: ₹" + total);

        sc.close();
    }
}

import java.util.Scanner;

class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Attended Classes: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / totalClasses;

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Student Name      : " + name);
        System.out.println("Total Classes     : " + totalClasses);
        System.out.println("Classes Attended  : " + attended);
        System.out.println("Attendance %      : " + percentage);

        if (percentage >= 75) {
            System.out.println("Status: Eligible for Exam ");
        } else {
            System.out.println("Status: Not Eligible ");
        }

        sc.close();
    }
}

import { useState, useReducer, useRef } from "react";

// Reducer Function
function reducer(state, action) {

  switch(action.type) {

    case "add":

      return [
        ...state,
        {
          id: Date.now(),
          text: action.payload,
          hidden: false
        }
      ];

    case "toggle":

      return state.map((task) =>

        task.id === action.payload

          ? { ...task, hidden: !task.hidden }

          : task
      );

    default:
      return state;
  }
}

function App() {

  // useState for input
  const [task, setTask] = useState("");

  // useReducer for tasks
  const [tasks, dispatch] = useReducer(reducer, []);

  // useRef for input focus
  const inputRef = useRef();

  // Add Task
  function addTask() {

    if(task.trim() !== "") {

      dispatch({
        type: "add",
        payload: task
      });

      setTask("");
    }
  }

  // Focus Input
  function focusInput() {
    inputRef.current.focus();
  }

  return (
    <div>

      <h1>Task Manager</h1>

      <input
        ref={inputRef}
        type="text"
        value={task}
        placeholder="Enter task"
        onChange={(e) => setTask(e.target.value)}
      />

      <button onClick={addTask}>
        Add Task
      </button>

      <button onClick={focusInput}>
        Focus Input
      </button>

      <hr />

      {tasks.map((task) => (

        <div key={task.id}>

          <p>
            {task.hidden ? "Content Hidden" : task.text}
          </p>

          <button
            onClick={() =>
              dispatch({
                type: "toggle",
                payload: task.id
              })
            }
          >
            Toggle
          </button>

        </div>

      ))}

    </div>
  );
}

export default App;
