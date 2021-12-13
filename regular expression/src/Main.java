import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String re = "[A-z0-9_]+@";
//        Pattern pt = Pattern.compile(re);
//        Matcher matcher = pt.matcher("axxe");
//        System.out.println("the regular expression is " + re + " result is " + matcher.matches());


        System.out.println(Pattern.matches(re, "ahmedHassanKoky1@"));
        System.out.println(Pattern.matches("\\d+", "32342"));
    }
}
