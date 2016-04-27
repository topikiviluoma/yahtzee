/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import api.Scores.Hand;
import java.util.Scanner;

/**
 *
 * @author topikivi
 */
public class Game {

    ScoresLogic sl;
    Round r;
    Scanner lukija;
    int roundNumber;

    public Game() {
        sl = new ScoresLogic();
        r = new Round("Pekka");
        lukija = new Scanner(System.in);
        r.createDice();
        roundNumber = 1;
    }

    public void run() {

        for (int i = 0; i < 15; i++) {
            System.out.println("Round: " + roundNumber);
            System.out.println("Scores: ");
            System.out.println(sl.getScores());
            r.rollDice();

            for (int k = 0; k < 2; k++) {
                System.out.println("Dice: ");
                System.out.println(r.getDice());
                System.out.print("Possible scores: ");
                r.printScores();
                System.out.println("");
                System.out.println("Valitse lukittavat:");
                String lukittavat = lukija.nextLine();
                if (lukittavat.contains("0")) {
                    r.getDice().get(0).lock();
                }
                if (lukittavat.contains("1")) {
                    r.getDice().get(1).lock();
                }
                if (lukittavat.contains("2")) {
                    r.getDice().get(2).lock();
                }
                if (lukittavat.contains("3")) {
                    r.getDice().get(3).lock();
                }
                if (lukittavat.contains("4")) {
                    r.getDice().get(4).lock();
                }

                r.rollDice();
                r.unlockDice();
            }
            System.out.println(r.getDice());
            r.printScores();
            while (true) {
                System.out.println("Valitse tulos: ");

                String tulos = lukija.nextLine();
                try {
                    sl.addScore(Hand.valueOf(tulos), sl.calcPossibleScores(r.getDice()).get(Hand.valueOf(tulos)));
                    roundNumber++;
                    break;
                } catch (Exception e) {
                    System.out.println("Valitse uudelleen");
                }
            }
        }

    }
}
