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
public class ScoresImpl implements Scores {

    private static final Hand[] upperHands = {
        Hand.ONES,
        Hand.TWOS,
        Hand.THREES,
        Hand.FOURS,
        Hand.FIVES,
        Hand.SIXES
    };

    private static final Hand[] lowerHands = {
        Hand.ONE_PAIR,
        Hand.TWO_PAIR,
        Hand.THREE_OF_A_KIND,
        Hand.FOUR_OF_A_KIND,
        Hand.FULL_HOUSE,
        Hand.SMALL_STRAIGHT,
        Hand.LARGE_STRAIGHT,
        Hand.YATZY,
        Hand.CHANCE
    };

    private HashMap<Hand, Integer> scores;
    private Scoreslogic scoreslogic;

    @Override
    public void addScore(Hand hand, int score) {
        if (scores.get(hand) != null) {
            throw new UnsupportedOperationException("Score already exists");
        }
        scores.put(hand, score);
    }

    @Override
    public HashMap<Hand, Integer> getScores() {
        return this.scores;
    }

    @Override
    public HashMap<Hand, Integer> getPossibleScores(ArrayList<Die> dice) {
        if (scoreslogic == null) {
            scoreslogic = new Scoreslogic();
        }
        scoreslogic.setDice(dice);
        return null;
    }

    @Override
    public int getUpperTotal() {
        return calcTotal(upperHands);
    }

    @Override
    public int getUpperBonus() {
        return getUpperTotal() >= UPPER_BONUS_LIMIT ? UPPER_BONUS_SCORE : 0;
    }

    @Override
    public int getLowerTotal() {
        return calcTotal(lowerHands);
    }

    @Override
    public int getTotal() {
        return getUpperTotal() + getLowerTotal();
    }

    private int calcTotal(Hand[] hands) {
        int total = 0;
        for (Hand hand : hands) {
            if (scores.containsKey(hand)) {
                total += scores.get(hand);
            }
        }
        return total;
    }

}
