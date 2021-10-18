import java.util.*;
import java.util.Random;

public class NestedArrayList {
    public static void main(String[] args) {
        // create 2d list
        List<List<Integer>> table = new ArrayList<List<Integer>>();

        table.add(Arrays.asList(3,4,5));
        table.add(Arrays.asList(1,444,88));
        table.add(Arrays.asList(33,456,567));
        NestedArrayList.print__2d__list(table);


        List<Integer> normalList = new ArrayList<Integer>();

        fill__theList(normalList, 6); // fill it with random number
        print__list(normalList); // print it without sorting
//        Collections.sort(normalList); // sort it
//        System.out.println(); // just a separator
//        print__list(normalList); // print it after sorting

        Collections.sort(normalList);
        Collections.reverse(normalList);
        System.out.println();
        print__list(normalList);





        /*
        * 3 4 5
        * 1 444 88
        * 33 456 567
        * */




    }

    public static void fill__theList(List<Integer> theList, int maxValue) {
        Random rand = new Random();
        for (int i = 0 ; i < maxValue + 1 ; i++) {
            theList.add(rand.nextInt(maxValue + 1));
        }
    }

    public static void print__list(List<Integer> thelist) {
        for (int item : thelist) {
            System.out.print(item + "\t");
        }
    }

    public static void print__2d__list(List<List<Integer>> table) {
        System.out.println("-----------------------");
        for (List<Integer> row : table) {
            print__list(row);
            System.out.println();
        }
        System.out.println("-----------------------");
    }


}
