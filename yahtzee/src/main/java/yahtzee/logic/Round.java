/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.ArrayList;

/**
 *
 * @author topikivi
 */
public class Round {

    private String player;
    private ArrayList<Die> d;

    public Round(String p) {
        this.player = p;
        this.d = new ArrayList<>();

    }

    public void luoNopat() {
        for (int i = 0; i < 5; i++) {
            d.add(new Die());
        }

    }

    public void rollDice() {
        for (Die die : d) {
            die.roll();
        }
    }

    public void rollDice(int[] which) {
        for (int i : which) {

            d.get(i).roll();
        }
    }
    
    public ArrayList<Die> getDice() {
        return d;
    }
    
    public void printScores() {
        ScoresLogic sl = new ScoresLogic();
        System.out.println("Mahdolliset tulokset: ");
        System.out.println(sl.calcPossibleScores(getDice()));
    }
}
