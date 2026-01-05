import java.util.Scanner;

public class Atm_simulator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int balance = 10000;
        int choice;

        System.out.println("Enter your pin to proceed : ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong pin!");
            return;
        }

        while (true) { 
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Current Balence : " + balance);
                    return;
                }
                
                case 2 -> {
                    System.out.println("Enter Amount to Deposit : ");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Deposit Sucessfull ^_^");
                    System.out.println("Current Balance : " + balance);
                    return;
                }
                
                case 3 -> {
                    System.out.println("Enter Amount to withdraw : ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Current Balence : "+ balance);
                        System.out.println("Please collect your cash! \nThankyou ^_^");
                    }else{
                        System.out.println("Insufficient Balence !");
                        return;
                    }
                    return;
                }
                
                case 4 -> {
                    return;
                }

                default -> System.out.println("Please Enter a vaild choice");
            }
        }
    }
}
