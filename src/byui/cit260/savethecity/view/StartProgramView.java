/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import byui.cit260.savethecity.controller.ProgramController;
import byui.cit260.savethecity.model.Player;
import java.util.Scanner;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public class StartProgramView {
    
    public StartProgramView() {
        
    }
    
    public void startProgram() {
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = ProgramController.createPlayer(playerName);
        
        SaveTheCity.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
    
    public String getPlayerName() {
        
        boolean isValidName = false;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        
        while(!isValidName) {
            String input = keyboard.nextLine();
            
            if(input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                System.out.println("Input is invalid - name must be at least 2 characters");
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
                
        
        System.out.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName) {
        System.out.println("==============================");
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Enjoy the game!");
        System.out.println("==============================");
        
    }
    
}
