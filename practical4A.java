
import java.util.Scanner;


class practical4A{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Marix A
        System.out.println("Enter rows of matix A : ");
        int r1 = sc.nextInt();
        System.out.println("Enter cols of matrix A : ");
        int c1 = sc.nextInt();

        //Matrix B
        System.out.println("Enter rows of matrix B : ");
        int r2 = sc.nextInt();
        System.out.println("Enter cols of matrix B : ");
        int c2 = sc.nextInt();

        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }

        int A[][] = new int [r1][c1];
        int B[][] = new int [r2][c2];
        int C[][] = new int [r1][c2];

        System.out.println("Enter the elements of Matrix A : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of MAtrix B : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        //multiply
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] = A[i][j] * B[i][j];
                }
            }
        }

        System.out.println("Result Matrix : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}