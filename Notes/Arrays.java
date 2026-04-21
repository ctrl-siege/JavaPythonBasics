import java.util.Scanner;

class Arrays {
    
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element: " + numbers[i]);
        }
    }
}