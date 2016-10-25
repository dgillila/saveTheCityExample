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
public class SampleHelpMenuView {

    private String menu = "\nHELP MENU"
            + "\nA - Option A"
            + "\nB - Option B"
            + "\nC - Option C"
            + "\nQ - Quit"
            + "\n";

    public SampleHelpMenuView() {

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
            case 'A':
                System.err.println("A");
                break;
            case 'B':
                System.err.println("B");
                break;
            case 'C':
                System.err.println("C");
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }

        return false;
    }
}
