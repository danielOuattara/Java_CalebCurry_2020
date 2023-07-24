package _36_arrays_values_from_input;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] grades_1 = new int[10];
        System.out.println(grades_1.length); // 10

        for (int i = 0; i < grades_1.length; i++) {
            grades_1[i] = i;
        }
        System.out.println("grades_1 = " + Arrays.toString(grades_1));

        System.out.println("--------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        int[] grades_2 = new int[3];
        for (int i = 0; i < grades_2.length; i++) {
            System.out.print("Enter your grade as integer value : ");
            grades_2[i] = scan.nextInt();
        }
        System.out.println("grades_2 = " + Arrays.toString(grades_2));

        System.out.println("--------------------------------------------------------------");

        System.out.print("Create your own Grade Array\nEnter the size of your Array : ");
        int size = scan.nextInt();
        int[] grades_3 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your grade as integer value : ");
            grades_3[i] = scan.nextInt();
        }
        System.out.println("grades_3 = " + Arrays.toString(grades_3));

        scan.close();


    }
}
