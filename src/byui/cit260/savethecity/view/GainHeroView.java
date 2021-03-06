/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import byui.cit260.savethecity.controller.CollectionController;
import byui.cit260.savethecity.controller.ProgramController;
import byui.cit260.savethecity.model.Hero;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public class GainHeroView {

    private final String menu = "The Hero needs your help calculating a pyramid volume - The volume needed is 30.";
    protected final PrintWriter console = SaveTheCity.getOutFile();
    protected final BufferedReader keyboard = SaveTheCity.getInFile();

    public GainHeroView() {

    }

    public void displayMenu() {

        console.println(menu);
        boolean result = getInput();

        if(result) {
            console.println("You solved the problem!");
        } else {
            console.println("Sorry, not the right answer - the hero leaves feeling sad because he couldn't solve the problem");
        }
        
    }

    public boolean getInput() {
        
        CollectionController cc = new CollectionController();

        console.println("Please enter a width: ");
        double width = getDoubleFromKeyboard();
        console.println("Please enter a length: ");
        double length = getDoubleFromKeyboard();
        console.println("Please enter a height: ");
        double height = getDoubleFromKeyboard();

        double vol = cc.calculatePyramidVolume(length, width, height);
        
        if(vol > 29 && vol < 31) {
            cc.addHeroToCollection(SaveTheCity.getPlayer().getLocation().getHero(), SaveTheCity.getPlayer());
            return true;
        }

        return false;
    }

    public double getDoubleFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            String input = keyboard.nextLine();
            try {
                double num = Double.parseDouble(input);
                return num;
            } catch (Exception e) {
                console.println("Please enter a number.");
            }
        }

        return 0;
    }

}
