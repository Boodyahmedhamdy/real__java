import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) {
        File file = new File("test.txt");


        try {
            FileReader reader = new FileReader(file.getPath());
            int data = reader.read();

            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        }
        catch(IOException e) {
            System.out.println(e);
        }



    }
}
