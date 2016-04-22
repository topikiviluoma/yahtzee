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
       DiceGui ui = new DiceGui();
        SwingUtilities.invokeLater(ui);
        

        //rundin testausta
//        Scanner lukija = new Scanner(System.in);
//        ScoresLogic sl = new ScoresLogic();
//
//        for (int i = 0; i < 15; i++) {
//            Round r = new Round("Pekka");
//            r.createDice();
//            r.rollDice();
//            System.out.println(r.getDice());
//            r.printScores();
//            for (int j = 0; j < 2; j++) {
//                System.out.println("Valitse lukittavat, varmista enterillä: ");
//                String lukittavat = lukija.nextLine();
//                if (lukittavat.contains("0")) {
//                    r.getDice().get(0).lock();
//                } else if (lukittavat.contains("1")) {
//                    r.getDice().get(1).lock();
//                } else if (lukittavat.contains("2")) {
//                    r.getDice().get(2).lock();
//                } else if (lukittavat.contains("3")) {
//                    r.getDice().get(3).lock();
//                } else if (lukittavat.contains("4")) {
//                    r.getDice().get(4).lock();
//                }
//
//                r.rollDice();
//                System.out.println(r.getDice());
//                r.printScores();
//            }
//            System.out.println("Valitse tulos: ");
//            String tulos = lukija.nextLine();
//            if (sl.calcPossibleScores(r.getDice()).containsKey(tulos)) {
//                
//            }
//            
//        }
    }
}
