import java.util.Scanner;

public class MP11 {
    public static void main(String[] args) {
        int size = 5; 

        // Printing P
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size / 2) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (i > 0 && i < size / 2) {
                System.out.print("*");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                System.out.println("*");
            }
        }

        System.out.println();

        // Printing C
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("*");
            }
        }

        System.out.println();

        // Printing S
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size / 2 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (i > 0 && i < size / 2) {
                System.out.println("*");
            } else {
                for (int j = 0; j < size - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        System.out.println();

        // Printing C again
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
    }
}