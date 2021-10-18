import java.util.Scanner;

public class IntroToOOP {
    public static void main(String[] args) //throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("enter your first name: ");
        user.firstName = scanner.nextLine();
        System.out.print("enter your last name: ");
        user.lastName = scanner.nextLine();
        System.out.println("enter the ID: ");
        int theID = scanner.nextInt();
        user.setID(theID);
        // Thread.sleep(1000);
        String fullName = user.getFullName();
        System.out.println(fullName);



        user.output();


    }
}
