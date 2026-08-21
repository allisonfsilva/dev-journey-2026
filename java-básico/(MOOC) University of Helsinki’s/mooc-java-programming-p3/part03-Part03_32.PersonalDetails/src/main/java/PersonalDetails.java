
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumYear = 0;
        int count = 0;
        String longName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0];
            int year = Integer.valueOf(parts[1]);

            if (name.length() > longName.length()) {
                longName = name;
            }

            sumYear = sumYear + year;
            count = count + 1;
        }

        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (1.0 * sumYear / count));

    }
}
