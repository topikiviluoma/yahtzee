/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.yahtzee;

import java.util.List;

/**
 *
 * @author topikivi
 */
public class Player {
    
    private String nimi;
    
    public Player(String nimi) {
        this.nimi = nimi;
    }
    
    public void roll(List<Dice> dice) {
        for (Dice d:dice) {
            d.roll();
        }
    }
    
}
