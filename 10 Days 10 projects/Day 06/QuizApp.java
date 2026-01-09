import java.util.Scanner;

class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("---JAVA QUIZ---");

        System.out.println("\n1. Which keyword is used to create an object in Java?");
        System.out.println("a) class");
        System.out.println("b) new");
        System.out.println("c) this");
        System.out.println("d) void");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b') {
            score++;
        }

        System.out.println("\n2. Which data type is used to store decimal values?");
        System.out.println("a) int");
        System.out.println("b) char");
        System.out.println("c) double");
        System.out.println("d) boolean");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c') {
            score++;
        }

        System.out.println("\n3. Which method is the entry point of Java program?");
        System.out.println("a) start()");
        System.out.println("b) run()");
        System.out.println("c) main()");
        System.out.println("d) init()");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'c') {
            score++;
        }

        System.out.println("\n--- QUIZ COMPLETED ---");
        System.out.println("Your Score: " + score + "/3");
    }
}
