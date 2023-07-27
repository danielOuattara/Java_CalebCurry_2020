package _50_convert_list_to_array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // How to convert List to Array ?:


        /* 1D List ---------- */
        List<Integer> grades1DList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("grades1DList = " + grades1DList);

        // solution 1
        Object[] grades1DArray_V1 = grades1DList.toArray();
        System.out.println("grades1DArray_V1 = " + Arrays.toString(grades1DArray_V1));
        System.out.println("-----------------");

        // solution 2
        int[] grades1DArray_V2 = new int[grades1DList.size()];
        for (int i = 0; i < grades1DList.size(); i++) {
            grades1DArray_V2[i] = grades1DList.get(i);
        }
        System.out.println("grades1DArray_V2 = " + Arrays.toString(grades1DArray_V2));
        System.out.println("-----------------");


        /* 2D List ------------------------------------------------------------------ */
        List<List<Integer>> grades2DList = new ArrayList<List<Integer>>();
        grades2DList.add(Arrays.asList(1, 2, 3, 4));
        grades2DList.add(Arrays.asList(5, 6, 7, 8));
        grades2DList.add(Arrays.asList(9, 10, 11, 12));

        // best
        System.out.println("grades2DList = " + grades2DList);

        System.out.println("-----------------");

        // solution 1
        Object[] grades2DArray_V1 = grades2DList.toArray();
        System.out.println("grades2DArray_V1 = " + Arrays.toString(grades2DArray_V1));
        System.out.println("-----------------");

//         solution 2 ?
//        int[] grades2DArray_V2 = new int[grades2DList.size()];
//        for (int i = 0; i < grades1DList.size(); i++) {
//            grades2DArray_V2[i] = grades2DList.get(i);
//        }
//        System.out.println("grades2DArray_V2 = " + Arrays.toString(grades2DArray_V2));
//        System.out.println("-----------------");
    }
}
