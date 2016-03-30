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
public class Scoreslogic {

    private HashMap<Integer, Integer> occurrences;

    public Scoreslogic() {
        occurrences = new HashMap<Integer, Integer>();
    }

    public void setDice(ArrayList<Die> dice) {
        for (Die d : dice) {
            int faceValue = d.getSilmaluku();
            if (occurrences.containsKey(faceValue)) {
                occurrences.put(faceValue, occurrences.get(faceValue) + 1);
            } else {
                occurrences.put(faceValue, 1);
            }
        }
    }

    public HashMap<Scores.Hand, Integer> calcPossibleScores() {
        if (occurrences.size() == 0) {
            throw new UnsupportedOperationException("Set dice before calculating.");
        }
        HashMap<Scores.Hand, Integer> possibleScores = new HashMap<Scores.Hand, Integer>();

        for (int i = 1; i <= 6; i++) {
            if (occurrences.containsKey(i)) {

                // Upper section
                possibleScores.put(mapIntToUpperHand(i), occurrences.get(i) * i);

                // One pair
                if (occurrences.get(i) >= 2) {
                    possibleScores.put(Scores.Hand.ONE_PAIR, 2 * i);
                }

                // Three of a kind
                if (occurrences.get(i) >= 3) {
                    possibleScores.put(Scores.Hand.THREE_OF_A_KIND, 3 * i);
                }

                // Four of a kind
                if (occurrences.get(i) >= 4) {
                    possibleScores.put(Scores.Hand.FOUR_OF_A_KIND, 4 * i);
                }

                // Yatzy
                if (occurrences.get(i) >= 5) {
                    possibleScores.put(Scores.Hand.YATZY, Scores.YATZY_SCORE);
                }
            }
        }
        return possibleScores;
    }

    private Scores.Hand mapIntToUpperHand(int i) {
        switch (i) {
            case 1:
                return Scores.Hand.ONES;
            case 2:
                return Scores.Hand.TWOS;
            case 3:
                return Scores.Hand.THREES;
            case 4:
                return Scores.Hand.FOURS;
            case 5:
                return Scores.Hand.FIVES;
            case 6:
                return Scores.Hand.SIXES;
        }
        throw new IllegalArgumentException("Illegal face value.");
    }

    
}


