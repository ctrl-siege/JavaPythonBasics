import java.util.Scanner;

public class MP12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;
        int row = 1;

        while (num <= n) {
            for (int i = 0; i < row; i++) {
                if (num > n) break;
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            row++;
        }
    }
}