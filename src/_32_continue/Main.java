package _32_continue;

public class Main {
    public static void main(String[] args) {
        // Iterator - Comparison - Update

        int i = 0;

        while (i < 10) {
            int j = i;
            while (j < 10) {
                if(j == 6) break;
                System.out.print(j + " ");
                j++;
            }
            System.out.println("");
            i++;
        }

        System.out.println("\n---------------------------------------\n");

        int k = 0;

        while (k < 10) {
            int l = k;
            while (l > 0) {
                System.out.print(l + " ");
                l--;
            }
            System.out.println("");
            k++;
        }

    }

}
