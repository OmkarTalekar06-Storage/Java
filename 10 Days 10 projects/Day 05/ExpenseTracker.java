
import java.util.ArrayList;
import java.util.Scanner;


public class ExpenseTracker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>();

        while (true) { 
            System.out.println("\n--- EXPENSE TRACKER ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter expense amount add : ");
                    double amount = sc.nextDouble();
                    expenses.add(amount);
                    System.out.println("Expense added sucessfully");
                }
                case 2 -> {
                    if (expenses.isEmpty()) {
                        System.out.println("You dont have any expenses");
                    }else{
                        System.out.println("Your Expenses : ");
                        for (int i = 0; i < expenses.size(); i++) {
                            System.out.println((i + 1) + " $" + expenses.get(i));
                        }
                    }
                }
                case 3 -> {
                    double Total = 0;
                    for (double exp : expenses) {
                        Total += exp;
                    }
                    System.out.println("Total Expense : $" + Total);
                }
                
                case 4 -> {
                    System.out.println("Exiting programme...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Not valid..");
            }
        }
    }
}
