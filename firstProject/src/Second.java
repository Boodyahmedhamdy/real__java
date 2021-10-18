public class Second {

    public static void main(String [] args)
    {
        System.out.println("hello");
        int x = 1, y = 3;
        int temp;
        System.out.println("before swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("after swapping");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
