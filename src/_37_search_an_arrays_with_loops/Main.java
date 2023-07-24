package _37_search_an_arrays_with_loops;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] grades_1 = {1, 2, 3, 77, 4, 5, 6, 7, 8, 9};
        System.out.println(grades_1.length); // 10

        for (int i = 0; i < grades_1.length; i++) {
            if (grades_1[i] == 77) {
                System.out.println("77 found at index " + i);
            }
        }

//        for (int item : grades_1) {
//            if (item == 77) {
//                System.out.println("77 found at index " + TODO: express the index of 77 in the array);
//            }
//        }
    }
}
