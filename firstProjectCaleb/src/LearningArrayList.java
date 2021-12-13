import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class LearningArrayList {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<Integer>();
        System.out.println("size of the array list is " + grades.size());

        grades.add(3);
        grades.add(656);
        grades.add(1, 1);

        System.out.println("size of the array list is " + grades.size());


        System.out.println(grades);
//        System.out.println(grades.get(2));

        if (grades.contains(1)) {
            System.out.println("1 is in index of " + grades.indexOf(1));
        }

        grades.clear();
        System.out.println(grades);
        System.out.println("grades are now cleared\n----------------------------------");

        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);

        System.out.println(grades);

        System.out.println(grades.remove(1));
        System.out.println(grades);

        System.out.println(grades.get(1));




    }
}
