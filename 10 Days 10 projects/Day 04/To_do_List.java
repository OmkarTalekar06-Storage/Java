import java.util.ArrayList;
import java.util.Scanner;

public class To_do_List {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) { 
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter task : ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Sucessfully added Task !");
                }
                
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No task to show");
                    }else{
                        System.out.println("\nYour Tasks : ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i+1)+ ". " + tasks.get(i));
                        }
                    }
                }
                    
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks to delete!");
                    }else{
                        System.out.println("Enter index to delete : ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        if (index > 0 && index <= tasks.size()) {
                            tasks.remove(index -1);
                            System.out.println("Task deleted !");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                }
                
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid Choice !");
            }
        }
    }
}
