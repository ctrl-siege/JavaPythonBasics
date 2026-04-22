import java.util.Scanner;

public class MP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = sc.nextInt();
        int count = 0;

        if (budget <= 10) {
            System.out.println("INVALID");
            return;
        }

        while (budget > 0) {
            int item = sc.nextInt();

            if (item < 0) {
                continue;
            }

            if (item == 0 || item > budget) {
                break;
            }

            if (item <= budget) {
                budget -= item;
                count++;
            }
        }

        System.out.println(count);
        System.out.println(budget);

        sc.close();
    }
}