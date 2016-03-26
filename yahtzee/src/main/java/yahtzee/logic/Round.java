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

    private Player player;
    private ArrayList<Dice> d;

    public Round(Player p) {
        this.player = p;
        this.d = new ArrayList<>();

    }

    public void luoNopat() {
        for (int i = 0; i < 5; i++) {
            d.add(new Dice());
        }

    }

    public void rollDice() {
        for (Dice die : d) {
            die.roll();
        }
    }

    public void rollDice(int[] which) {
        for (int i : which) {
            if (d.contains(i)) {
                d.get(i).roll();
            }
        }
    }

}
