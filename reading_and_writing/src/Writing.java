import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args){

        File file = new File("test.txt");

        try{
            FileWriter writer = new FileWriter(file.getPath());
            // writer.write("something");
            for(int i = 0 ; i < 10 ; i++) {
                writer.write(i + "\n");
            }
            writer.close();
        }
        catch(Exception e) {
            System.out.println("something went wrong " + e);
        }


    }
}
