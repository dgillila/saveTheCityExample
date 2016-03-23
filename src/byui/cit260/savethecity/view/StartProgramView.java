/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import byui.cit260.savethecity.controller.ProgramController;
import byui.cit260.savethecity.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public class StartProgramView {
    
    protected final PrintWriter console = SaveTheCity.getOutFile();
    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    
    public StartProgramView() {
        
    }
    
    public void startProgram() {
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = ProgramController.createPlayer(playerName);
        
        SaveTheCity.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    public String getPlayerName() {
        
        boolean isValidName = false;
        String name = "";
        
        console.println("Please enter your name: ");
        
        while(!isValidName) {
            String input = "";
            try {
                input = keyboard.readLine();
            } catch(Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input");
            }
            
            if(input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                console.println("Input is invalid - name must be at least 2 characters");
            }
        }
        
        return name;
    }
    
    public void displayBanner() {
        String welcome = "";
        welcome = "========================" +
                "\nWelcome to Hero City" +
                "\nThis game will be fun." +
                "\nMore text here." +
                "\n==========================";
                
        
        console.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName) {
        console.println("==============================");
        console.println("Welcome " + playerName + ".");
        console.println("Enjoy the game!");
        console.println("==============================");
        
    }
    
}
