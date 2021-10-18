import java.util.Scanner;

public class IntegerClass {
    public static void main(String[] args)
    {
        System.out.println("this is Integer class class");
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number: ");
        String stringNumber = scanner.nextLine();

        // wrong
        // int y = Integer.valueOf(stringNumber);
        // right
        Integer y = Integer.valueOf(stringNumber);
        int x = Integer.parseInt(stringNumber);

        System.out.println("y is Integer and y = " + y);
        System.out.println("x is int and x = " + x);

        System.out.println("x is " + Double.isNaN(Double.parseDouble(stringNumber)));





    }
}
