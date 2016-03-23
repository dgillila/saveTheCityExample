/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

import byui.cit260.savethecity.controller.CollectionController;
import byui.cit260.savethecity.controller.MovementController;
import byui.cit260.savethecity.exception.LoseGameException;
import byui.cit260.savethecity.model.Location;
import savethecity.SaveTheCity;

/**
 *
 * @author Daniel
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\nP - Search for people"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nM - View Map"
                + "\nL - View Current Location"
                + "\nQ - Quit");
    }

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);

        switch (charSel) {
            case 'P':
                searchPeople();
                break;
            case 'N':
                moveNorth();
                break;
            case 'E':
                moveEast();
                break;
            case 'S':
                moveSouth();
                break;
            case 'W':
                moveWest();
                break;
            case 'M':
                viewMap();
                break;
            case 'L':
                viewCurrentLocation();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }

    private void searchPeople() {
        CollectionController cc = new CollectionController();
        if(cc.findHero(SaveTheCity.getPlayer())) {
            console.println("You found " + SaveTheCity.getPlayer().getTeam().get(SaveTheCity.getPlayer().getTeam().size() - 1).getName());
        } else {
            System.err.println("You find nobody here");
        }
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        if(mc.moveNorth(SaveTheCity.getGame()) == false) {
            console.println("You cannot move there");
            throw new LoseGameException("You lose");
        }
    }

    private void moveEast() {
        MovementController mc = new MovementController();
        if(mc.moveEast(SaveTheCity.getGame()) == false) {
            console.println("You cannot move there");
        }
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        if(mc.moveSouth(SaveTheCity.getGame()) == false) {
            console.println("You cannot move there");
        }
    }

    private void moveWest() {
        MovementController mc = new MovementController();
        if(mc.moveWest(SaveTheCity.getGame()) == false) {
            console.println("You cannot move there");
        }
    }

    private void viewMap() {
        console.println(SaveTheCity.getGame().getMap().getMapString());
    }
    
    private void viewCurrentLocation() {
        Location l = SaveTheCity.getGame().getPlayer().getLocation();
        console.println("You are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }
}
