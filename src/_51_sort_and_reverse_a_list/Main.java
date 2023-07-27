package _51_sort_and_reverse_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> grades1DList = Arrays.asList(7, 2, 4, 3, 7, 6);
        System.out.println("grades1DList = " + grades1DList);

        Collections.sort(grades1DList);
        System.out.println("grades1DList = " + grades1DList);

        Collections.reverse(grades1DList);
        System.out.println("grades1DList = " + grades1DList);

    }
}
