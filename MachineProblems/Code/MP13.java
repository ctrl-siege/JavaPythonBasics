import java.util.Scanner;

public class MP13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        text = text.toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}