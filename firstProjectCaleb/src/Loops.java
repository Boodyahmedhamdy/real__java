public class Loops {
    public static void main(String[] args) {

        // Loops.print__table(3);




    }

    public static void print__table(final int len)
    {
        for (int i = 1; i < len + 1; i++)
        {
            for (int j = 1; j < len + 1; j++)
            {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}


