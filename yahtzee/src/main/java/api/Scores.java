/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * Scores rajapinnan toteuttaminen.
 */
public interface Scores {

    int UPPER_BONUS_LIMIT = 63;
    int UPPER_BONUS_SCORE = 50;
    int YATZY_SCORE = 50;

    /**
     * Kädet enumeina.
     */
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
    /**
     * "yläkädet" yhtenä käsitauluna.
     */
    Hand[] upperHands = {
        Hand.ONES,
        Hand.TWOS,
        Hand.THREES,
        Hand.FOURS,
        Hand.FIVES,
        Hand.SIXES
    };
    /**
     * "alakädet" tauluna.
     */
    Hand[] lowerHands = {
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

    /**
     * lisätään tulos ja pisteet.
     *
     * @param hand käsi
     * @param score käden pisteet
     */

    void addScore(Hand hand, int score);

    /**
     * palauttaa kaikki pisteet.
     *
     * @return palauttaa pisteet
     */
    HashMap<Hand, Integer> getScores();

    /**
     * palauttaa yläkäsien pisteet.
     *
     * @return palauttaa pisteet
     */
    int getUpperTotal();

    /**
     * palauttaa mahdolliset bonukset, jos yläkäsien yhteispistemäärä on 63 tai
     * yli.
     *
     * @return palauttaa bonuspisteet eli 50
     */
    int getUpperBonus();

    /**
     * palauttaa alakäsien pisteet.
     *
     * @return palauttaa pisteet
     */
    int getLowerTotal();

    /**
     *palauttaa kokonaispistemäärän.
     * @return palauttaa kokonaispisteet
     */
    int getTotal();

}
