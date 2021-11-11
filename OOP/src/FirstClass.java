import java.util.List;
import java.util.ArrayList;

public class FirstClass {
    public static void main(String[] args) {
        Boy ahmed = new Boy("ahmed");
        Boy boody = new Boy();

        List<Human> people = new ArrayList<Human>();
        people.add(ahmed);
        people.add(boody);

        Human.print__human(people);
        System.out.println(Boy.numberOfBoys);


    }



//    public static int test(int x) {
//        return x;
//    }
//    public static int test(int x, int y) {
//        return y;
//    }

}
