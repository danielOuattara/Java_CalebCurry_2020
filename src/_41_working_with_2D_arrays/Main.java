package _41_working_with_2D_arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] grades_1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(grades_1[0][0]);
        System.out.println(grades_1[0][1]);
        System.out.println(grades_1[0][2]);

        System.out.println("Arrays.deepToString(grades_1) = " + Arrays.deepToString(grades_1));
    }
}
