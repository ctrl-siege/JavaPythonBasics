import java.util.Scanner;

public class MP6 {

  public static void main(String[] args) {

    int highest = 0;
    int avg;
    int lowest = 101;
    int passed = 0;
    int total = 0;

  	int[] grades = new int[10];

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < grades.length; i++) {

        grades[i] = input.nextInt();

        if (grades[i] > highest) {
            highest = grades[i];
        }

        if (grades[i] < lowest) {
            lowest = grades[i];
        }

        if (grades[i] >= 75){
            passed++;
        }
  
    }

    for (int i = 0; i < grades.length; i++) {
        total += grades[i];
    }

    avg = total / grades.length;

    System.out.println("Average Grade: " + avg);
    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest Grade: " + lowest);
    System.out.println("Number of Students Passed: " + passed);

  }
  
}