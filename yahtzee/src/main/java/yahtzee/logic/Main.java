/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Scanner;
import yahtzee.logic.Player;
import yahtzee.logic.Round;
;

/**
 *
 * @author topikivi
 */
public class Main {

    public static void main(String[] args) {
        //rundin testausta
        Scanner lukija = new Scanner(System.in);
        Player p = new Player("Pekka");
        Round r = new Round(p);
        r.luoNopat();
        r.rollDice();
        for (int i = 0; i < 5; i++) {
            System.out.println("noppa " + i + ": " + r.getDice().get(i));
        }
        ScoresLogic sl = new ScoresLogic();
        
        System.out.println(r.getDice());
        System.out.println("Mahdolliset tulokset: ");
        System.out.println(sl.calcPossibleScores(r.getDice()));
        
    }
}
