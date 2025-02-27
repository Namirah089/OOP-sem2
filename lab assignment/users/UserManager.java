package users;

import util.PasswordValidator;

public class UserManager {
    private static final String storedUsername = "admin";
    private static final String storedPassword = "secure123";

    public static class LoginProcessor {
        public static boolean authenticate(String username, String password) {
            PasswordValidator validator = new PasswordValidator();
            return username.equals(storedUsername) && validator.validate(storedPassword);
        }
    }
}
