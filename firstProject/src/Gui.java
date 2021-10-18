import javax.swing.JOptionPane;

public class Gui {
    public static void main(String [] args)
    {
        String name = JOptionPane.showInputDialog("what is your name ");
        // JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
        JOptionPane.showMessageDialog(null, name + " is " + age + " years old");


    }
}
