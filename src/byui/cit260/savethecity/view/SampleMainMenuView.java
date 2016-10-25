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
public class SampleMainMenuView {

    private String menu = "\nMAIN MENU"
            + "\nN - Start New Game"
            + "\nL - Load Saved Game"
            + "\nH - Help Menu"
            + "\nQ - Quit"
            + "\n";

    public SampleMainMenuView() {

    }

    public void display() {
        boolean done = false;
        do {
            System.out.println("\n" + this.menu);
            
            String value = this.getInput();

            done = this.doAction(value);
        } while (!done);

    }

    public String getInput() {
        Scanner in = new Scanner(System.in);
        String input = " ";

        boolean validInput = false;

        while (!validInput) {
            input = in.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            if (input.length() < 1) {
                System.out.println("\nInvalid value: You must enter a character.");
            } else {
                validInput = true;
            }
        }
        return input;
    }

    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }

        return false;
    }

    private void startNewGame() {
        System.out.println("START NEW GAME CALLED");
    }

    private void loadGame() {
        System.out.println("LOAD GAME CALLED");
    }
    
    private void helpMenu() {
        SampleHelpMenuView shmv = new SampleHelpMenuView();
        shmv.display();
    }
}
