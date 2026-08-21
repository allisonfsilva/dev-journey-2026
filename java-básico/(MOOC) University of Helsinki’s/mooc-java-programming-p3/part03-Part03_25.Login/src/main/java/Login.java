
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String key = scanner.nextLine();

        boolean loginValido = false;

        for (int i = 0; i < username.length; i++) {

            if (name.equals(username[i]) && key.equals(password[i])) {
                loginValido = true; 
                break; 
            }
        }

        if (loginValido == true) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
