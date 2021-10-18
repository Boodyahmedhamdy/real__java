import java.util.Scanner;
import java.util.Arrays;

public class LeaningArrays {

    public static void main(String[] args) {
//        int[] grades1 = new int[10];
//        int[] grades2 = new int[10];
//
////        available syntax in java
////        int[] grades2 = grades1;
//
//
//        if (Arrays.equals(grades1, grades2)) {
//            System.out.println("both arrays are equal");
//        }

        /*
        System.out.println(grades);
        System.out.println(Arrays.toString(grades));
        grades[3] = 33;
        int resualt = LeaningArrays.search__for__in(33, grades);
        System.out.println(resualt);
        */

        String[][] studentNames = {
                {"ahemd", "hassan", "koky"},
                {"boody", "ahmed", "hamdy"},
                {"esamil", "mohamed", "kotb", "ibrahim", "hassan"}
        };

        output__2D(studentNames);

        // length here is number of rows
        System.out.println(studentNames.length);

    }

    public static void output(int[] arr) {
        System.out.println("index - value\n---------------------------------");
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }

    public static void input(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println((arr.length - i) + " remaining elements");
            System.out.print("arr[" + i + "] : ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }

    }

    public static void edit(int[] arr, int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("arr[" + index + "] : ");
        arr[index] = scanner.nextInt();
    }

    public static int search__for__in(int number, int[] arr) {

        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] == number) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void output__2D(String[][] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("\n---------------------------------");
        }
    }
}
