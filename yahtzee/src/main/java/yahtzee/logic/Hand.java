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
public class Hand {
    
    private ArrayList<Die> dice;
    private int sum;
    
    public Hand(ArrayList<Die> dice) {
        
        this.dice = dice;
        this.sum = 0;
    }
    
    public int laskeSumma() {
        this.sum = 0;
        for (Die d: dice) {
            this.sum += d.getSilmaluku();
        }
        return this.sum;
    }
    
}
