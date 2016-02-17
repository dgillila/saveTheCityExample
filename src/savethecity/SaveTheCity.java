/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity;

import byui.cit260.savethecity.model.Game;
import byui.cit260.savethecity.model.Player;
import byui.cit260.savethecity.view.StartProgramView;

/**
 *
 * @author Daniel
 */
public class SaveTheCity {

    private static Player player;
    private static Game game;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = new StartProgramView();
        
        startProgram.startProgram();
        
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SaveTheCity.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        SaveTheCity.game = game;
    }
    
    
    
    
    
}
