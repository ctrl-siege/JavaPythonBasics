import java.util.Scanner;

public class MP14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] values = new int[num];

        for (int i = 0; i < num; i++){
            values[i] = input.nextInt();
        }

        int total = 0;

        for (int n : values) {
            if (n >= 85) {
                System.out.println("FAST");
            } else {
                System.out.println("SLOW");
            }
            total += n;
        }

        int average = total / num;

        System.out.println(average);

        if (average >= 85) {
            System.out.println("FAST");
        } else {
            System.out.println("SLOW");
        }
    }
}