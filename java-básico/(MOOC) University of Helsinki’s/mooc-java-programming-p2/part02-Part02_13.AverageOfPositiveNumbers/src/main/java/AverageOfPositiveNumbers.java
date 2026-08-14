
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sumP = 0;
        int totP = 0;
        double avg = (double) sumP / totP;

        while (number != 0) {
            number = (Integer.valueOf(scanner.nextLine()));
            if (number > 0) {
                sumP = sumP + number;
                totP = totP + 1;
                avg = (double) sumP / totP;
            } 

        }
        if (totP == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }

    }
}
