/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.controller;

import byui.cit260.savethecity.model.Game;
import byui.cit260.savethecity.model.Hero;
import byui.cit260.savethecity.model.Map;
import byui.cit260.savethecity.model.Player;
import byui.cit260.savethecity.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
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
        
        populateMapWithHeroes(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        SaveTheCity.setGame(g);
    }
    
    public static void populateMapWithHeroes(Map map) {
        
        List<Hero> heroes = createHeroList();
        boolean success = false;
        
        for(Hero h : heroes) {
            
            do {
                int row = (int)(Math.random() * Map.NUM_ROWS);
                int col = (int)(Math.random() * Map.NUM_COLS);
            
                 success = false;
                
                if(map.getLocation(row, col).getHero() == null) {
                    map.getLocation(row, col).setHero(h);
                    success = true;
                }
                
            } while(success == false);
            
        }
        
    }
    
    public static List<Hero> createHeroList() {
        
        List<Hero> heroList = new ArrayList<>();
        
        Hero superman = new Hero();
        superman.setName("Superman");
        superman.setHitpoints(10);
        superman.setAttackpoints(2);
        heroList.add(superman);
        
        Hero batman = new Hero();
        batman.setName("Batman");
        batman.setHitpoints(5);
        batman.setAttackpoints(4);
        heroList.add(batman);
        
        return heroList;
    }
    
    
    public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(SaveTheCity.getGame());
        } catch(Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
    
    public static void loadGame(String filePath) {
        Game game = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            SaveTheCity.setGame(game);
            SaveTheCity.setPlayer(game.getPlayer());
        } catch (Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
}
