package org.example.alexis;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        JOptionPane.showConfirmDialog(null,
                "Registrera dig.",
                "Registration",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        String username = JOptionPane.showInputDialog("Ange Användarnamn");
        String password = JOptionPane.showInputDialog("Ange Lösenord");

        PasswordHandling passwordHandling = new PasswordHandling();

        String hashedPassword = passwordHandling.hashPassword(password);
        System.out.println("The hashed password: " + hashedPassword);

        boolean isThisCorrect = passwordHandling.checkPassword(password, hashedPassword);
        System.out.println("Password verified for user: " + username + " , password is correct: " + isThisCorrect);


    }
}