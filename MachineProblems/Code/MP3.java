import java.util.Scanner;

public class MP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String parenthesis = sc.nextLine();

        while (parenthesis.trim().isEmpty()) {
            System.out.println("PLEASE ENTER A VALID STRING");
            parenthesis = sc.nextLine();
        }

        char[] stack = new char[parenthesis.length()];
        int top = -1;

        for (char ch : parenthesis.toCharArray()) {

            if (Character.isWhitespace(ch)) {
                continue;
            }

            if ("()[]{}".indexOf(ch) == -1) {
                System.out.println("NOT BALANCED");
                return;
            }

            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch; 
            } 
            else { 

                if (top == -1) {
                    System.out.println("NOT BALANCED");
                    return;
                }

                char last = stack[top--];

                if ((ch == ')' && last != '(') ||
                    (ch == ']' && last != '[') ||
                    (ch == '}' && last != '{')) {
                    System.out.println("NOT BALANCED");
                    return;
                }
            }
        }

        if (top == -1) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }

        sc.close();
    }
}