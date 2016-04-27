/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Random;

/**
 *
 * Tämä luokka on noppaa varten, luokka hoitaa myös random silmäluvun arvonnan
 * ja vastaa tiedosta onko noppa lukittu vai ei
 *
 */
public class Die {

    private int faceValue;
    public boolean locked;

    /**
     * Konstruktori asettaa oletuksena nopan ei lukittuun tilaan.
     */
    public Die() {
        this.faceValue = 1;
        this.locked = false;

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    /**
     *
     * Arvotaan silmäluku
     */
    public void roll() {
        Random random = new Random();

        this.faceValue = random.nextInt(6) + 1;
    }

    /**
     * Asetetaan tila
     *
     */
    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean locked() {
        return this.locked;
    }
    
    @Override
    public String toString() {
        return "" + this.faceValue;
    }

    

}
