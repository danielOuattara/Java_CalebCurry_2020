package _47_for_loops_with_list;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // How to initialize a List ?: create an array then convert that array to a List
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // best
        System.out.println("grades = " + grades);

        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }

        System.out.println("-----------------");

        for (int i = 0; i < grades.size(); i++) {
            grades.set(i, grades.get(i) * 3);
            System.out.println(grades.get(i));
        }

        System.out.println("-----------------");

        System.out.println("grades = " + grades);
    }
}
