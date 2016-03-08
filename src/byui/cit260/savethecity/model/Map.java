/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.model;

/**
 *
 * @author Daniel
 */
public class Map {

    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;

    private Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
    }

    public void init() {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location loc = new Location();

                //Create a random location type
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);

                matrix[row][col] = loc;
            }
        }
    }

    public String getMapString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name().charAt(0) + "\t";
            }
            rtn += "\n";
        }

        return rtn;
    }

    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }
}
