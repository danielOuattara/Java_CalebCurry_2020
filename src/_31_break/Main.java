package _31_break;

public class Main {
    public static void main(String[] args) {
        // Iterator - Comparison - Update

        for (int i = 0; i < 10; i++) {
            for (int k = i; k < 10; k++) {
                if(k==6) continue;
                System.out.print(k + " ");
            }
            System.out.println("");
        }

        System.out.println("\n---------------------------------------\n");

        for (int i = 0; i < 10; i++) {
            for (int k = i; k > 0; k--) {
                if(k==6) continue;
                System.out.print(k + " ");
            }
            System.out.println("");
        }

    }

}
