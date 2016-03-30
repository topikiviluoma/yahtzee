/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Scanner;

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
        Scoreslogic sl = new Scoreslogic();
        sl.setDice(r.getDice());
        System.out.println(r.getDice());
        System.out.println(sl.calcPossibleScores());
        

    }
}
