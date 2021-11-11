import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter a number: ");
            int x = scanner.nextInt();

            System.out.print("enter another number: ");
            int y = scanner.nextInt();

            int res = x / y;
            System.out.println("the result is " + res);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        catch(InputMismatchException e) {
            System.out.println(e);
            System.out.println("please only enter a numbers");
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
    }
}
