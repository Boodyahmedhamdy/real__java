import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("something");
        File file = new File("output.txt");
        String fName, mName, Lname;
        String ageLine;
        fName = mName = Lname = ageLine = "";
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getName(), true));
            writer.write("ahmed\n");
            writer.write("hassan\n");
            writer.write("koky\n");
            writer.write("age:" + 11);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getName()));
            fName = reader.readLine();
            mName = reader.readLine();
            Lname = reader.readLine();
            ageLine = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println("your name is: " + fName + " " + mName + " " + Lname);
//        for(String s : ageLine.split(":")){
//            System.out.println(s);
//        }
////        System.out.println((Integer.parseInt(ageLine.split(":")[1])) + 1);
////        System.out.println((ageLine.split(":")[1]) + 1);
    }
}
