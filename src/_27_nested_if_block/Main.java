package _27_nested_if_block;

public class Main {
    public static void main(String[] args) {
        // Iterator - Comparison - Update

        boolean showFive = false;
        for (int i = 0; i < 10; i++) {
            System.out.println(" iterator: " + i);
            if (i == 5) {
                if (showFive) {
                    System.out.println("Show five is true");
                }
                System.out.println(" i = 5 Found !");
            }
        }

    }
}
