import java.util.Scanner;

public class MP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        if (number > 25) {
            System.out.println("EXCEEDS MAXIMUM SIZE");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%5d ", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}