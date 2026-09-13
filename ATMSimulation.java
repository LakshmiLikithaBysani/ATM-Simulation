import java.util.Scanner;

class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000;

        System.out.println("===== ATM SIMULATION =====");

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.println("\nLogin Successful!");

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Current Balance: " + balance);

            } else if (choice == 2) {

                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();

                balance = balance + deposit;

                System.out.println("Deposit Successful!");
                System.out.println("Updated Balance: " + balance);

            } else if (choice == 3) {

                System.out.print("Enter withdrawal amount: ");
                double withdrawal = sc.nextDouble();

                if (withdrawal <= balance) {
                    balance = balance - withdrawal;

                    System.out.println("Withdrawal Successful!");
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else {

                System.out.println("Invalid Choice!");
            }

        } else {

            System.out.println("Incorrect PIN!");
        }

        System.out.println("\nThank you for using the ATM.");

        sc.close();
    }
}
