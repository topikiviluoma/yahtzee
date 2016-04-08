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

    private int faceValue;
    public boolean locked;
    

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

    public void roll() {
        Random random = new Random();

        this.faceValue = random.nextInt(6) + 1;
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
        return Integer.toString(faceValue);
    }

}
