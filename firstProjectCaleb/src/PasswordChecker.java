import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args)
    {
        String password = "ahmedhassankoky";
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your password : ");
        String interedPassword = scanner.nextLine();

        while(!(password.equals(interedPassword)))
        {
            System.out.print("wrong password!! enter it again : ");
            interedPassword = scanner.nextLine();
        }
        System.out.println("signed in successfully");
    }
}
