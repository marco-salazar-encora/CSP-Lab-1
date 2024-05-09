import java.lang.Character;
// Make the password length a global variable
public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 8;

    public static boolean isValidPassword(String password) {
        if (password.length() < MIN_PASSWORD_LENGTH) {
            return false;
        }
        boolean hasUpperCase = hasUpperCaseLetter(password);
        boolean hasLowerCase = hasLowerCaseLetter(password);
        boolean hasNumber = hasNumber(password);
        return hasUpperCase && hasLowerCase && hasNumber;
    }

    private static boolean hasUpperCaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowerCaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String password = "veryStrongP@ss";
        boolean valid = isValidPassword(password);
        System.out.println("Password is valid: " + valid);
    }
}

