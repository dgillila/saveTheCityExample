/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity;

import byui.cit260.savethecity.model.Game;
import byui.cit260.savethecity.model.Player;
import byui.cit260.savethecity.view.SampleWelcomeView;
import byui.cit260.savethecity.view.StartProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Daniel
 */
public class SaveTheCity {

    private static Player player;
    private static Game game;

    private static PrintWriter outFile;
    private static BufferedReader inFile;

    private static PrintWriter logFile;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
        SampleWelcomeView swv = new SampleWelcomeView();
        swv.displayStartProgramView();
        
        
//        StartProgramView startProgram = null;
//        try {
//            inFile = new BufferedReader(new InputStreamReader(System.in));
//            outFile = new PrintWriter(System.out, true);
//            String logPath = "log.txt";
//            logFile = new PrintWriter(logPath);
//            
//            startProgram = new StartProgramView();
//
//            startProgram.startProgram();
//        } catch (Exception e) {
//            e.printStackTrace();
//            startProgram.startProgram();
//        } finally {
//            try {
//                if (inFile != null) {
//                    inFile.close();
//                }
//                if (outFile != null) {
//                    outFile.close();
//                }
//                if (logFile != null) {
//                    logFile.close();
//                }
//            } catch (Exception ex) {
//                System.out.println("Error closing files");
//            }
//        }

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SaveTheCity.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SaveTheCity.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SaveTheCity.logFile = logFile;
    }
    
}
