
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int n = (Integer.valueOf(scanner.nextLine()));
        System.out.println("Last number?");
        int n1 = (Integer.valueOf(scanner.nextLine()));
        int sum = 0;
        for (int i = n; i <= n1; i++) {
            sum += i;

        }
        System.out.println("The sum is "+sum);

    }
}
