
import java.util.Random;
import java.util.Scanner;

class PasswordGenerator{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";

        System.out.println("Enter the password length : ");
        int length = sc.nextInt();

        String Password = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            Password += characters.charAt(index);
        }

        System.out.println("Generated Password : " + Password);
        sc.close();
    }
}
