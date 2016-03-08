/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.controller;

import byui.cit260.savethecity.model.Game;
import byui.cit260.savethecity.model.Map;
import byui.cit260.savethecity.model.Player;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName) {
        
        if(playerName == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }

    public static void createNewGame(Player player) {
        
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        SaveTheCity.setGame(g);
    }
    
}
