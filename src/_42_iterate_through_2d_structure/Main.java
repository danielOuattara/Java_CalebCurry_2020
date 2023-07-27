package _42_iterate_through_2d_structure;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] grades_1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, -1, 10, 12, 15},
        };
        System.out.println("Arrays.deepToString(grades_1) = " + Arrays.deepToString(grades_1));

        for (int row = 0; row < grades_1.length; row++) {
            System.out.println("");
            for (int column = 0; column < grades_1[row].length; column++) {
                System.out.print(grades_1[row][column] + ", ");
            }
        }
    }
}
