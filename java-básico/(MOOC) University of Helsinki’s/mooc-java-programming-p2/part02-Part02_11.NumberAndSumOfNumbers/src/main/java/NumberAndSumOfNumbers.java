
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        int tot = -1;

        while (number != 0) {
            System.out.println("Give a number:");
            number = (Integer.valueOf(scanner.nextLine()));
            sum = sum + number;
            tot = tot + 1;
        }

        System.out.println("Number of numbers: " + tot);
        System.out.println("Sum of the numbers: " + sum);

    }
}
