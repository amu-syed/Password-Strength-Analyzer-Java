import java.util.Locale;
import java.util.Scanner;

// using Object-Oriented Programming by creating a dedicated class
// to handle the security validation logic.

class PasswordValidator {
    private String password;

    // constructor to initialize the object
    public PasswordValidator(String password){
        this.password = password;
    }

    // method to check against basic security policies
    public boolean isStrong(){
        if (password.length() < 8){
            return false;
        }

        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasLower = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*'");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
        }

        // this is main class
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Security Tool: Password Strength Analyzer");
        System.out.print("Enter a password to test its strength: ");
        String input = scanner.nextLine();

        // Instantiating the OOP class
        PasswordValidator validator = new PasswordValidator(input);

        // output of the security assessment
        if (validator.isStrong()){
            System.out.println("Result: STRONG PASSWORD. Meets the security policies");
        } else {
            System.out.println("Result: WEAK PASSWORD. Does not meet the security policies");
        }
        scanner.close();
    }
        }