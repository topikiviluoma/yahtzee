/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.yahtzee;

import java.util.Random;

/**
 *
 * @author topikivi
 */
public class Dice {

    private int silmaluku;

    public Dice() {
        this.silmaluku = 0;
    }

    public int getSilmaluku() {
        return silmaluku;
    }
    
    public void heita() {
        Random random = new Random();
                
        this.silmaluku = random.nextInt(6) + 1;
    }
   

}
