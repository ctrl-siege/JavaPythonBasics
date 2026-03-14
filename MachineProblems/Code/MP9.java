import java.util.Scanner;

public class MP9 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int find = myobj.nextInt();
        int pos = 0;
        boolean found = false;
        int prev = 0;
        int holder;
        int numContainer = 0;

        for (int i = 0; numContainer <= find; i++) {
            
            if(numContainer == 0){
                prev = numContainer;
                numContainer++;
                continue;
            }

            if(numContainer == find){
                pos = i;
                found = true;
                break;
            }
            holder = numContainer;
            numContainer += prev;
            prev = holder;

        }
        if (found) {
            System.out.println( String.valueOf(find) + " is found on position " + String.valueOf(pos));
        } else {
            System.out.println( String.valueOf(find) + " does not exist");
        }


    }
}