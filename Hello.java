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
                System.out.println("Login Successful ✅");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials! Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked ❌");
        }

        sc.close();
    }
}
    

