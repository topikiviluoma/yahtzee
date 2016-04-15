/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Scanner;

import yahtzee.logic.Round;
import gui.AddPlayers;
import javax.swing.SwingUtilities;

;

/**
 *
 * @author topikivi
 */
public class Main {

    public static void main(String[] args) {
        AddPlayers ui = new AddPlayers();
        SwingUtilities.invokeLater(ui);
        System.out.println();

        //rundin testausta
//        Scanner lukija = new Scanner(System.in);
//        Player p = new Player("Pekka");
//        Round r = new Round(p);
//        r.luoNopat();
//        r.rollDice();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("noppa " + i + ": " + r.getDice().get(i));
//        }
//        ScoresLogic sl = new ScoresLogic();
//
//        System.out.println(r.getDice());
//        r.printScores();
//        for (int a = 0; a < 3; a++) {
//            System.out.println("Valitse lukittavat: ");
//            String lukittavat = lukija.nextLine();
//            if (lukittavat.contains("0")) {
//                r.getDice().get(0).lock();
//            }
//            if (lukittavat.contains("1")) {
//                r.getDice().get(1).lock();
//            }
//            if (lukittavat.contains("2")) {
//                r.getDice().get(2).lock();
//            }
//            if (lukittavat.contains("3")) {
//                r.getDice().get(3).lock();
//            }
//            if (lukittavat.contains("4")) {
//                r.getDice().get(4).lock();
//            }
//            for (Die die : r.getDice()) {
//                if (!die.locked) {
//                    die.roll();
//                }
//            }
//            System.out.println(r.getDice());
//            r.printScores();
//        }
//        System.out.println("Valitse tulos: "); 
//        String tulos = lukija.nextLine();
//        System.out.println("Syötä pisteet: ");
//        int pisteet = Integer.parseInt(lukija.nextLine());
//        if (tulos.contains("TWOS")) {
//            sl.addScore(Scores.Hand.TWOS, pisteet);
//        }
//        System.out.println(sl.getScores());
    }
}
