/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Random;

/**
 *
 * @author topikivi
 */
public class Die {

    private int silmaluku;
    public boolean locked;
    

    public Die() {
        this.silmaluku = 1;
        this.locked = false;

    }

    public int getSilmaluku() {
        return silmaluku;
    }

    public void setSilmaluku(int silmaluku) {
        this.silmaluku = silmaluku;
    }

    public void roll() {
        Random random = new Random();

        this.silmaluku = random.nextInt(6) + 1;
    }

    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean locked() {
        return this.locked;
    }

    public String toString() {
        return Integer.toString(silmaluku);
    }

}
