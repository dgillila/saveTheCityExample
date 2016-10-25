/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SampleWelcomeView {

    private void displayBanner() {

        System.out.println("\n******************************"
                + "\nWelcome to the 'Save the City' game"
                + "\n******************************");

    }

    public void displayStartProgramView() {

        displayBanner();

        String playerName = getPlayerName();

        displayWelcome(playerName);
        
        SampleMainMenuView smmv = new SampleMainMenuView();
        smmv.display();
    }

    private String getPlayerName() {
        
        Scanner in = new Scanner(System.in);
        boolean isValidName = false;
        String name = "";

        System.out.println("Please enter your name: ");

        while (!isValidName) {
            String input = "";
            input = in.nextLine();

            if (input != null && input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
            }
        }

        return name;
    }

    private void displayWelcome(String playerName) {
        System.out.println("==============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Enjoy the game!");
        System.out.println("==============================");
    }
    
}
