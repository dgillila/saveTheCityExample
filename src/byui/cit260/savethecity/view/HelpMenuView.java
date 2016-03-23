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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nO - Objective"
            + "\nM - Movement help"
            + "\nQ - Quit");
    }

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'A':
                aboutGame();
                break;
            case 'H':
                howToPlay();
                break;
            case 'O':
                objectives();
                break;
            case 'M':
                movementHelp();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }
        
        return false;
    }

    private void aboutGame() {
        console.println("About stuff");
    }

    private void howToPlay() {
        console.println("How to play");
    }

    private void objectives() {
        console.println("Objectives stuff");
    }

    private void movementHelp() {
        console.println("Movement Help");
    }
}
