/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.controller;

import byui.cit260.savethecity.model.Hero;
import byui.cit260.savethecity.model.Location;
import byui.cit260.savethecity.model.Player;

/**
 *
 * @author Daniel
 */
public class CollectionController {
    
    public double calculatePyramidVolume(double length, double width, double height) {
        
        if(length <= 0 || width <= 0 || height <= 0) {
            return -1;
        }
        
        double totalMult = length * width * height;
        
        return totalMult / 3;
    }
    
    public boolean findHero(Player p) {
        Location l = p.getLocation();
        if(l.getHero() != null) {
            p.addHero(l.getHero());
            l.setHero(null);
            return true;
        }
        
        return false;
    }
    
    public void addHeroToCollection(Hero h, Player p) {
        p.addHero(h);
    }
    
}
