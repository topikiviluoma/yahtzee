/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import api.Scores;
import java.util.Scanner;

import yahtzee.logic.Round;
import gui.AddPlayers;
import gui.DiceGui;
import gui.Ui;
import javax.swing.SwingUtilities;

;

/**
 *
 * @author topikivi
 */
public class Main {

    public static void main(String[] args) {
        Game g = new Game();
        g.run();

    }
}
