package _49_nested_for_each_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // How to initialize a 2D List ?:
        List<List<Integer>> grades = new ArrayList<List<Integer>>();

        grades.add(Arrays.asList(1, 2, 3, 4));
        grades.add(Arrays.asList(5, 6, 7, 8));
        grades.add(Arrays.asList(9, 10, 11, 12));

        // best
        System.out.println("grades = " + grades);

        System.out.println("-----------------");

        for (List<Integer> singleList : grades) {
            System.out.println(singleList);
        }

        System.out.println("-----------------");

        for (List<Integer> singleList : grades) {
            for (Integer singleGrade : singleList) {
                System.out.println(singleGrade);
            }
        }

        System.out.println("-----------------");


    }
}
