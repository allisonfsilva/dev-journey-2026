
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            String[] pieces= words.split(" ");
            String last= pieces[pieces.length-1];
            System.out.println(last);

        }


    }
}
