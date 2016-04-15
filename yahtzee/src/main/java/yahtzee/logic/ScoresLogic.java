package yahtzee.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ScoresLogic implements Scores {

    
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

    protected HashMap<Hand, Integer> calcPossibleScores(ArrayList<Die> dice) {
        HashMap<Integer, Integer> occurrences = createOccurrenceMap(dice);
        HashMap<Hand, Integer> possibleScores = new HashMap<Hand, Integer>();

        calcUpperSection(possibleScores, occurrences);
        calcOnePair(possibleScores, occurrences);
        calcTwoPairs(possibleScores, occurrences);
        calcThreeOfAKind(possibleScores, occurrences);
        calcFourOfAKind(possibleScores, occurrences);
        calcSmallStraight(possibleScores, occurrences);
        calcLargeStraight(possibleScores, occurrences);
        calcFullHouse(possibleScores, occurrences);
        calcYatzy(possibleScores, occurrences);
        calcChance(possibleScores, occurrences);

        return possibleScores;
    }

    private void calcChance(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (!scores.containsKey(Hand.CHANCE)) {
            possibleScores.put(Hand.CHANCE, calcSum(occurrences));
        }
    }

    private void calcYatzy(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (!scores.containsKey(Hand.YATZY) && occurrences.size() == 1) {
            possibleScores.put(Hand.YATZY, YATZY_SCORE);
        }
    }

    private void calcFullHouse(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.FULL_HOUSE) || occurrences.size() != 2) {
            return;
        }
        for (int i : occurrences.values()) {
            if (i != 2 && i != 3) {
                return;
            }
        }
        possibleScores.put(Hand.FULL_HOUSE, calcSum(occurrences));
    }

    private void calcLargeStraight(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.LARGE_STRAIGHT)) {
            return;
        }
        for (int i = 2; i <= 6; i++) {
            if (!occurrences.containsKey(i)) {
                return;
            }
        }
        possibleScores.put(Hand.LARGE_STRAIGHT, 20);
    }

    private void calcSmallStraight(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.SMALL_STRAIGHT)) {
            return;
        }
        for (int i = 1; i <= 5; i++) {
            if (!occurrences.containsKey(i)) {
                return;
            }
        }
        possibleScores.put(Hand.SMALL_STRAIGHT, 15);
    }

    private void calcFourOfAKind(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.FOUR_OF_A_KIND)) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() >= 4) {
                possibleScores.put(Hand.FOUR_OF_A_KIND, 4 * entry.getKey());
            }
        }
    }

    private void calcThreeOfAKind(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.THREE_OF_A_KIND)) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() >= 3) {
                possibleScores.put(Hand.THREE_OF_A_KIND, 3 * entry.getKey());
            }
        }
    }

    private void calcTwoPairs(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.TWO_PAIRS)) {
            return;
        }
        int firstPair = 0;
        int secondPair = 0;
        for (int i = 1; i <= 6; i++) {
            if (occurrences.containsKey(i) && occurrences.get(i) > 1) {
                if (firstPair == 0) {
                    firstPair = 2 * i;
                } else {
                    secondPair = 2 * i;
                }
            }
        }
        if (firstPair > 0 && secondPair > 0) {
            possibleScores.put(Hand.TWO_PAIRS, firstPair + secondPair);
        }
    }

    private void calcOnePair(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        if (scores.containsKey(Hand.ONE_PAIR)) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            if (occurrences.containsKey(i) && occurrences.get(i) > 1) {
                possibleScores.put(Hand.ONE_PAIR, 2 * i);
            }
        }
    }

    private void calcUpperSection(HashMap<Hand, Integer> possibleScores, HashMap<Integer, Integer> occurrences) {
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            Hand hand = mapIntToUpperHand(entry.getKey());
            if (!scores.containsKey(hand)) {
                possibleScores.put(hand, entry.getKey() * entry.getValue());
            }
        }
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
        return getUpperTotal() + getLowerTotal() + getUpperBonus();
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

        for (Die die : dice) {
            int faceValue = die.getFaceValue();
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

    private int calcSum(HashMap<Integer, Integer> occurrences) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            sum += entry.getKey() * entry.getValue();
        }
        return sum;
    }

}
