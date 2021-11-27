import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public int age ;
    public double a;

    public static void create() {

    }
    Window() {
        this.setSize(400, 450);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(21, 56, 8));
        ImageIcon icon = new ImageIcon("checked.png");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("window");
    }

    Window(String title, int r, int g, int b) {
        this.setSize(400, 450);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(r, g, b));
        ImageIcon icon = new ImageIcon("checked.png");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle(title);
    }


}
