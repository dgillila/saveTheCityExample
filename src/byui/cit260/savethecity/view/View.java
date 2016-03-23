/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected final PrintWriter console = SaveTheCity.getOutFile();
    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    
    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);

    }

    @Override
    public String getInput() {
        String input = " ";
        boolean validInput = false;

        while (!validInput) {
            console.println("\n" + this.displayMessage);

            try {
                input = keyboard.readLine();
            } catch(Exception e) {
                throw new RuntimeException("Error reading input");
            }
            input = input.trim();
            input = input.toUpperCase();

            if (input.length() < 1) {
                console.println("\nInvalid value: You must enter a character.");
                continue;
            }
            break;
        }
        return input;
    }

}
