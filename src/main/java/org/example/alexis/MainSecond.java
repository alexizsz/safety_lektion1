package org.example.alexis;

import javax.swing.*;

public class MainSecond {

    private static PasswordHandling passwordHandling = new PasswordHandling();

    static java.util.HashMap<String, String> hashMap = new java.util.HashMap<>();

    public static void main(String[] args) {

        JOptionPane.showConfirmDialog(null,
                "Registrera dig.",
                "Registration",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        String username = JOptionPane.showInputDialog("Ange ditt användarnamn");
        String password = JOptionPane.showInputDialog("Ange ditt lösenord");

        String hashedPassword = passwordHandling.hashPassword(password);
        hashMap.put(username, hashedPassword);
        System.out.println(username + " your hashed password is: " + hashedPassword);

        JOptionPane.showMessageDialog(null, "Logga in.", "Login", JOptionPane.INFORMATION_MESSAGE);
        String loginUsername = JOptionPane.showInputDialog("Ange ditt användarnamn för inloggning");
        String loginPassword = JOptionPane.showInputDialog("Ange ditt lösenord för inloggning");

        if (hashMap.containsKey(loginUsername)) {
            String storedPassword = hashMap.get(loginUsername);
            boolean isCorrect = passwordHandling.checkPassword(loginPassword, storedPassword);
            if (isCorrect) {
                System.out.println("Logged in as: " + loginUsername);
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("User not found");
        }
    }
}
