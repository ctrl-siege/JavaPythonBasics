import java.util.Scanner;

public class MP15 {

    public static String firstMethod(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static String secondMethod(String text) {
        boolean isPalindrome = true;
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.println(firstMethod(text));

    }
}