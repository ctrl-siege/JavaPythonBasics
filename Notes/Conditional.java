import java.util.Scanner;

class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
        System.out.println("You are an adult.");
        } else {
        System.out.println("You are a minor.");
        }

        input.close();
        }
}