
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        int tot = -1;
        double avg = 0; 

        while (number != 0) {
            System.out.println("Give a number:");
            number = (Integer.valueOf(scanner.nextLine()));
            sum = sum + number;
            tot = tot + 1;
            avg = (double)sum/tot;
            
        }

        System.out.println("Average of the numbers: " + avg);
    }
}
