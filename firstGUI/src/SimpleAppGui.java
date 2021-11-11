import javax.swing.JOptionPane;
public class SimpleAppGui {

    public static void main(String[] args){
//        String name = "  ahmed";
//        System.out.println(name.replace("a", "A").strip());
        String name = JOptionPane.showInputDialog("enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height"));

        JOptionPane.showMessageDialog(null,
                "welcome " + name + " you are " + age + " years old" +
                        " and your height is " + height + " cm");

    }
}
