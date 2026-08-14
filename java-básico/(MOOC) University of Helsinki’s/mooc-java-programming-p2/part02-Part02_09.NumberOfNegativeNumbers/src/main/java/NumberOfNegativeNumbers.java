
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int totneg = 0;

        while (number != 0) {
            System.out.println("Give a number:");
            number = (Integer.valueOf(scanner.nextLine()));
            if (number<0){
                totneg = totneg+1;
            }

        }
        System.out.println("Number of negative numbers: "+totneg);

    }
}
