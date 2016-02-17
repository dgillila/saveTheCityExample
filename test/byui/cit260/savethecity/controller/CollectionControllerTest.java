/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class CollectionControllerTest {
    
    public CollectionControllerTest() {
    }

    /**
     * Test of calculatePyramidVolume method, of class CollectionController.
     */
    @Test
    public void testCalculatePyramidVolume() {
        System.out.println("calculatePyramidVolume");
        double length = 2.0;
        double width = 4.0;
        double height = 5.0;
        CollectionController instance = new CollectionController();
        double expResult = 13.33;
        double result = instance.calculatePyramidVolume(length, width, height);
        assertEquals(expResult, result, 0.01);
        
        length = -1.0;
        width = 4.0;
        height = 5.0;
        expResult = -1;
        result = instance.calculatePyramidVolume(length, width, height);
        assertEquals(expResult, result, 0.01);
        
        length = 1.0;
        width = 4.0;
        height = -5.0;
        expResult = -1;
        result = instance.calculatePyramidVolume(length, width, height);
        assertEquals(expResult, result, 0.01);
    }
    
}
