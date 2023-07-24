package _38_arrays_sort_and_parallelSort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades_1 = {3, 9, 1, 77, 5, 6, 4, 7, 8, 2};
        System.out.println(grades_1.length); // 10

        System.out.println("grades_1 " + Arrays.toString(grades_1)); // output before sorting

        Arrays.sort(grades_1); // this modifies the grades_1 array
        System.out.println("grades_1 " + Arrays.toString(grades_1)); // output after sorting

        System.out.println("-----------------------------------------");

        int[] grades_2 = {3, 9, 1, 77, 5, 6, 2};
        System.out.println(grades_2.length); // 7

        System.out.println("grades_2 " + Arrays.toString(grades_2)); // output before sorting

        Arrays.parallelSort(grades_2); // this modifies the grades_2 array
        System.out.println("grades_2 " + Arrays.toString(grades_2)); // output after sorting

    }
}
