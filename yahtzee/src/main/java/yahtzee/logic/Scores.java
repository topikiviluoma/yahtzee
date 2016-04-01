/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author topikivi
 */
public interface Scores {

    enum Hand {
        ONES,
        TWOS,
        THREES,
        FOURS,
        FIVES,
        SIXES,
        ONE_PAIR,
        TWO_PAIRS,
        THREE_OF_A_KIND,
        FOUR_OF_A_KIND,
        SMALL_STRAIGHT,
        LARGE_STRAIGHT,
        FULL_HOUSE,
        YATZY,
        CHANCE
    }
    int UPPER_BONUS_LIMIT = 63;
    int UPPER_BONUS_SCORE = 50;
    int YATZY_SCORE = 50;

    void addScore(Hand hand, int score);

    HashMap<Hand, Integer> getScores();

    HashMap<Hand, Integer> calcPossibleScores(ArrayList<Die> dice);
    
    int getUpperTotal();

    int getUpperBonus();

    int getLowerTotal();

    int getTotal();

}
