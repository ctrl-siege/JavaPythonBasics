import java.util.Scanner;

public class Mp2 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;

        Scanner input = new Scanner(System.in);

        int[] num = new int[15];


        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (num[i] > 0){
                pos++;
            } else if (num[i] < 0) {
                neg++;
            }
        }

        System.err.println();
        System.err.println("Count of Even Numbers: "+even);
        System.err.println("Count of Odd Numbers: "+odd);
        System.err.println("Count of Positive Numbers: "+pos);
        System.err.println("Count of Negative Numbers: "+neg);
    }
}