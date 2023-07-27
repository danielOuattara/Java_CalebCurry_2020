package _48_for_each_loops_with_list;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // How to initialize a List ?: create an array then convert that array to a List
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // best
        System.out.println("grades = " + grades);

        System.out.println("-----------------");

        for (Integer singleGrade : grades) {
            System.out.println(singleGrade);
        }

        System.out.println("-----------------");

        System.out.println("grades = " + grades);
    }
}
