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
import java.util.Random;

class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High ⬆️");
            } 
            else if (guess < number) {
                System.out.println("Too Low ⬇️");
            } 
            else {
                System.out.println("Correct! ");
            }

        } while (guess != number);

        sc.close();
    }
}


import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

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
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("what is the price for each?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println(total  + " " + currency);


        sc.close();



    }
}

class Animal {
  String type = "Animal";
}

class Dog extends Animal {
  String type = "Dog";

  public void printType() {
    System.out.println(super.type); // Access parent attribute
  }
}

public class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.printType();
  }
}

