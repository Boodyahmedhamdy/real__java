import com.sun.security.jgss.GSSUtil;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("hassan.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        file = new File("text_files/koky.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        file = new File("../testFIle.txt");
        System.out.println(file.exists());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());





    }
}
