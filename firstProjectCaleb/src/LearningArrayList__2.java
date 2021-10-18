import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LearningArrayList__2 {
    public static void main(String[] args) {
        int[] normalArray = {3,45,5};
        List<Integer> normalList = Arrays.asList(3, 21, 4);
        List <Integer> anotherList = new ArrayList<Integer>();
        System.out.println(anotherList);
        System.out.println(normalList);
        System.out.println(Arrays.toString(normalList.toArray()));

        LearningArrayList__2.printArrayList(normalList);


    }

    public static void printArrayList(List<Integer> theList) {
        System.out.println("--------------------");
//        for (int i = 0 ; i < theList.size() ; i++) {
//            System.out.println(i + " - " + theList.get(i));
//        }
        for (int item : theList) {
            System.out.println(theList.indexOf(item) + " - " + item);
        }
        System.out.println("--------------------");
    }
}
