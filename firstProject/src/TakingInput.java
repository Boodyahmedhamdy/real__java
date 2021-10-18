import java.util.Scanner;
public class TakingInput {
    public static void main(String [] args)
    {
        System.out.println("welcome");

        // defined the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name : ");
        String name = scanner.nextLine();

        System.out.print("what is Your age : ");
        int age = scanner.nextInt();

        scanner.nextLine(); // to flush the buffer
        System.out.print("what make you come here today : ");
        String like = scanner.nextLine();


        System.out.println("hello, " + name + " you are " + age + " years old " +
                "You like " + like);



    }


}
