import java.util.Scanner;

public class MP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        String outlier = sc.nextLine();

        int count = 0;
        int remaining = 0;

        for (String item : arr) {
            if (item.equals(outlier)) {
                count++;
            } else {
                remaining++;
            }
        }

        System.out.println(count);
        System.out.println(remaining);

        sc.close();
    }
}