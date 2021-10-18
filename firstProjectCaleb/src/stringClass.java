import java.util.Locale;
import java.util.Scanner;

public class stringClass {
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();

        String word = "  ahmedHassan  ";
        System.out.println(word.charAt(5));

        System.out.println("------------------------");
        for (int i = 0 ; i < word.length() ;i++)
        {
            System.out.println(word.charAt(i));
        }
        System.out.println("------------------------");
        System.out.println(word.contains("Ahme"));
        System.out.println("------------------------");

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        System.out.println(word.strip().toUpperCase());
        System.out.println(word.stripTrailing());
        System.out.println(word.stripLeading());
        System.out.println("------------------------");
        System.out.println(word.strip().substring(2, 5)); // med




    }
}
