import java.util.Scanner;

public class MP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaves = sc.nextInt();
        int height = sc.nextInt();
        int tree_w = sc.nextInt();
        int tree_h = sc.nextInt();

        if (leaves <= 0 || height <= 0 || tree_w <= 0 || tree_h <= 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int current_leaves = leaves;

        for (int layer = 1; layer <= height; layer++) {
            for (int row = 1; row <= current_leaves; row++) {

                for (int s = 0; s < (height + leaves - row); s++) {
                    System.out.print(" ");
                }

                for (int st = 0; st < (2 * row - 1); st++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            current_leaves++;
        }

        for (int i = 1; i <= tree_h; i++) {

            for (int s = 0; s < (1 + (height + leaves) - tree_w); s++) {
                System.out.print(" ");
            }

            for (int st = 0; st < tree_w; st++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}