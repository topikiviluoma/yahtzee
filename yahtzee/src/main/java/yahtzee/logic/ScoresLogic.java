/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author topikivi
 */
public class ScoresLogic implements Scores {

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
            Hand.TWO_PAIRS,
            Hand.THREE_OF_A_KIND,
            Hand.FOUR_OF_A_KIND,
            Hand.SMALL_STRAIGHT,
            Hand.LARGE_STRAIGHT,
            Hand.FULL_HOUSE,
            Hand.YATZY,
            Hand.CHANCE
    };

    private HashMap<Hand, Integer> scores;

    public ScoresLogic() {
        scores = new HashMap<Hand, Integer>();
    }

    public void addScore(Hand hand, int score) {
        if (scores.containsKey(hand)) {
            throw new UnsupportedOperationException("Score already exists.");
        }
        scores.put(hand, score);
    }

    public HashMap<Hand, Integer> getScores() {
        return scores;
    }

    public HashMap<Hand, Integer> calcPossibleScores(ArrayList<Die> dice) {
        HashMap<Integer, Integer> occurrences = createOccurrenceMap(dice);
        HashMap<Hand, Integer> possibleScores = new HashMap<>();

       
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            if (occurrences.containsKey(i)) {
                sum += occurrences.get(i) * i;

                // Upper section
                Hand hand = mapIntToUpperHand(i);
                if (!scores.containsKey(hand)) {
                    possibleScores.put(hand, occurrences.get(i) * i);
                }

                // One pair
                if (!scores.containsKey(Hand.ONE_PAIR) && occurrences.get(i) >= 2) {
                    possibleScores.put(Hand.ONE_PAIR, 2 * i);
                }

                // Three of a kind
                if (!scores.containsKey(Hand.THREE_OF_A_KIND) && occurrences.get(i) >= 3) {
                    possibleScores.put(Hand.THREE_OF_A_KIND, 3 * i);
                }

                // Four of a kind
                if (!scores.containsKey(Hand.FOUR_OF_A_KIND) && occurrences.get(i) >= 4) {
                    possibleScores.put(Hand.FOUR_OF_A_KIND, 4 * i);
                }
            }
        }

       // Two Pairs TODO

        // Full house
        if (!scores.containsKey(Hand.FULL_HOUSE) && occurrences.size() == 2) {
            boolean fullHouse = true;
            for (Integer i : occurrences.values()) {
                if (i < 2 || i > 3) {
                    fullHouse = false;
                    break;
                }
            }
            if (fullHouse) {
                possibleScores.put(Hand.FULL_HOUSE, sum);
            }
        }

        // Small straight & large straight
        if (occurrences.size() == 5) {
            Set<Integer> faceValues = occurrences.keySet();
            if (!(faceValues.contains(1) && faceValues.contains(6))) {
                if (!scores.containsKey(Hand.SMALL_STRAIGHT) && faceValues.contains(1)) {
                    possibleScores.put(Hand.SMALL_STRAIGHT, 15);
                } else if (!scores.containsKey(Hand.LARGE_STRAIGHT) && faceValues.contains(6)) {
                    possibleScores.put(Hand.LARGE_STRAIGHT, 20);
                }
            }
        }

        // Yatzy
        if (!scores.containsKey(Hand.YATZY) && occurrences.size() == 1) {
            possibleScores.put(Hand.YATZY, Scores.YATZY_SCORE);
        }

        // Chance
        if (!scores.containsKey(Hand.CHANCE)) {
            possibleScores.put(Hand.CHANCE, sum);
        }

        return possibleScores;
    }

    public int getUpperTotal() {
        return calcTotal(upperHands);
    }

    public int getUpperBonus() {
        return getUpperTotal() >= UPPER_BONUS_LIMIT ? UPPER_BONUS_SCORE : 0;
    }

    public int getLowerTotal() {
        return calcTotal(lowerHands);
    }

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

    private HashMap<Integer, Integer> createOccurrenceMap(ArrayList<Die> dice) {
        HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();

        for (int i = 0; i < dice.size(); i++) {
            int faceValue = dice.get(i).getSilmaluku();
            if (occurrences.containsKey(faceValue)) {
                occurrences.put(faceValue, occurrences.get(faceValue) + 1);
            } else {
                occurrences.put(faceValue, 1);
            }
        }

        return occurrences;
    }

    private Hand mapIntToUpperHand(int i) {
        switch (i) {
            case 1:
                return Hand.ONES;
            case 2:
                return Hand.TWOS;
            case 3:
                return Hand.THREES;
            case 4:
                return Hand.FOURS;
            case 5:
                return Hand.FIVES;
            case 6:
                return Hand.SIXES;
        }

        throw new IllegalArgumentException("Illegal face value.");
    }

   


}
