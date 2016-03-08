/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.view;

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
            case 'Q':
                return true;
            default:
                System.out.println("Invalid option");
                break;
        }

        return false;
    }

    private void searchPeople() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveNorth() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveEast() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveSouth() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moveWest() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void viewMap() {
        System.out.println(SaveTheCity.getGame().getMap().getMapString());
    }
}
