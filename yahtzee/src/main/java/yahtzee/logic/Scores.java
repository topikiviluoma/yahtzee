/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.HashMap;

/**
 *
 * @author topikivi
 */
public interface Scores {

    HashMap<Commons.Hand, Integer> getHands();

    void addHand(Commons.Hand hand, int score);

    int getUpperTotal();

    int getUpperBonus();

    int getLowerTotal();

    int getTotal();

}
