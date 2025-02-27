package main;

import users.UserManager;
import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        System.out.print("Enter Username: ");
        String username = console.readLine();

        String password = new String(console.readPassword("Enter Password: "));

        if (UserManager.LoginProcessor.authenticate(username, password)) {
            System.out.println("Login Successful! Access Granted.");
        } else {
            System.out.println("Invalid Credentials! Access Denied.");
        }
    }
}
