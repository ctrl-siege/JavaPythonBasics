import java.util.Scanner;

public class MP8 {
    public static void main(String[] args) {
        int[] candidates = {0,0,0,0,0};
        boolean tie = false;
        int winner = 0;
        int highest = 0;

        int voted = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            voted = input.nextInt();

            switch (voted - 1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    candidates[voted-1]++;
                    break;
                default:
                    System.out.println("Skipped: Invalid vote");
            }
        }

        System.out.println();

        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i]);
            if (candidates[i] > highest) {
                highest = candidates[i];
                winner = i;
            }
        }

        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < candidates.length; j++) {
                if (i == j){
                    continue;
                }

                if (candidates[i] == candidates[j] && candidates[i] == highest) {
                    tie = true;
                    break;
                }
            }
        }

        if (tie){
            System.out.println("Tie detected");
        }else{
            System.out.println("Winner: " + String.valueOf(winner + 1));
        }
        
        
        
    }
}