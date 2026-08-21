
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         while (true) {
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            String[] pieces = string.split(" ");
            
            for (String word : pieces) {
                
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
         }

    }
}
