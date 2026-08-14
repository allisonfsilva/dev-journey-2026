
import java.util.Scanner;
import org.graalvm.compiler.nodes.BreakpointNode;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = (Integer.valueOf(scanner.nextLine()));
            int square = number * number;
            
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number > 0) {
                System.out.println(square);
                continue;
            } else {
                break;
            }
        }

    }

}
