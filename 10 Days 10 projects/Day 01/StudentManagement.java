
import java.io.*;
import java.util.Scanner;

class StudentManagement {

    static String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3: 
                    searchStudent(sc);
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    static void addStudent(Scanner sc){
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);

            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name : ");
            String name = sc.nextLine();
            
            fw.write(id + "," + name + " \n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing the file!");
        }
    }
    @SuppressWarnings({"ConvertToTryWithResources", "UseSpecificCatch"})
    static void viewStudent(){
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("No records found!");
            }

            Scanner filesc = new Scanner(file);
            System.out.println("\n");

            while (filesc.hasNextLine()) {
                String line = filesc.nextLine();
                String[] data = line.split(",");
                System.out.println("ID : " + data[0] + " Name : " + data[1]);
            }
            filesc.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    @SuppressWarnings({"ConvertToTryWithResources", "UseSpecificCatch"})
    static void searchStudent(Scanner sc){
        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No records found");
                return;
            }
            System.out.println("Enter ID to search : ");
            int searchID = sc.nextInt();

            Scanner filesc = new Scanner(file);
            boolean found = false;

            while (filesc.hasNextLine()) {
                String line = filesc.nextLine();
                String[] data = line.split(",");

                if (Integer.parseInt(data[0])== searchID) {
                    System.out.println("Student found : " + data[1]);
                    found=true;
                    break;
                }
            }
            if (!found) {
                System.out.println("student not found");
            }
            filesc.close();
        } catch (Exception e) {
            System.out.println("Error searching student");
        }
    }
}

