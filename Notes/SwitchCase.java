import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Countdown from: ");
        int count = input.nextInt();

        switch (count){
            case 5:
                System.out.println("5");
            case 4:
                System.out.println("4");
            case 3:
                System.out.println("3");
            case 2:
                System.out.println("2");
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("Number out of bound.");
        
        }

        input.close();
    }
}