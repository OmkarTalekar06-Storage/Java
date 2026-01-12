import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();
        ArrayList<String> issuedBooks = new ArrayList<>();

        while (true) { 
            System.out.println("\n---LIBRARY MANAGEMENT---");
            System.out.println("1. Add Book");
            System.out.println("2. View Available Books");
            System.out.println("3. Issue Books");
            System.out.println("4. Return Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1->{
                    System.out.println("Enter book name : ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book Added Sucessfully!");
                    break;
                }
                case 2->{
                    if (books.isEmpty()) {
                        System.out.println("No books available");
                    }else{
                        System.out.println("Available Books : ");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i+1) + ". " + books.get(i));
                        }
                    }
                    break;
                }
                case 3->{
                    if (books.isEmpty()) {
                        System.out.println("No books to issue");
                    }
                    else{
                        System.out.println("Enter book number to issue : ");
                        int issueIndex = sc.nextInt();

                        if (issueIndex > 0 && issueIndex <= books.size()) {
                            issuedBooks.add(books.get(issueIndex - 1));
                            System.out.println("books issued : " + books.get(issueIndex-1));
                            books.remove(issueIndex-1);
                        }else{
                            System.out.println("Ubable to issue book.");
                        }
                    }
                    break;
                }
                case 4->{
                    if (issuedBooks.isEmpty()) {
                        System.out.println("No books to return");
                    }else{
                        System.out.println("Issued books : ");
                        for (int i = 0; i < issuedBooks.size(); i++) {
                            System.out.println((i+1) + ". " + issuedBooks.get(i));
                        }
                    }
                    System.out.println("Enter book number to return : ");
                    int returnIndex = sc.nextInt();

                    if (returnIndex > 0 && returnIndex <= issuedBooks.size()) {
                        books.add(issuedBooks.get(returnIndex-1));
                        System.out.println("Book returned : "+ issuedBooks.get(returnIndex-1));
                        issuedBooks.remove(returnIndex-1);
                    }else{
                        System.out.println("Invalid book");
                    }
                    break;
                }

                case 5->{
                    System.out.println("Exiting program....");
                    sc.close();
                    return;
                }

                default->{
                    System.out.println("Invalid choice.");
                }
            }

        }
    }    
}
