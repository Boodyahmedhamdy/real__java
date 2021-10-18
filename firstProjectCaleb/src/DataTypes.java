import java.util.Scanner;
import java.math.BigDecimal;
public class DataTypes {
    String name = "name";
    public static void main(String[] args)
    {

        System.out.println("welcome");

        // System.out.println("what is your name: ");
        // System.out.println(new Scanner(System.in).nextLine());
        Scanner answers = new Scanner(System.in);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE / 8 + " bytes");

        System.out.println(Math.pow(2, 4));


        /*
        DataTypes user = new DataTypes();
        user.sayHello();
        System.out.println(DataTypes.names());
        */
        /*
        System.out.print("enter the length : ");
        int length, height ;

        length = answers.nextInt();
        System.out.print("enter the height : ");
        height = answers.nextInt();

        int area = length * height;
        System.out.println("the area = " + area);

        System.out.print("write very big number: ");
        BigDecimal money = answers.nextBigDecimal();
        System.out.println(money);
        */
        /*
        boolean ans = answers.nextBoolean();
        System.out.println(ans);
        System.out.println(answers);
        */



    }
    public static String names()
    {
        return "ahmed hassan";
    }
    public void sayHello()
    {
        System.out.println("hello " + this.name);
    }
}
