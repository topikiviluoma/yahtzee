/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yahtzee.logic.Die;
import yahtzee.logic.Scores;
import yahtzee.logic.Scoreslogic;

/**
 *
 * @author topikivi
 */
public class ScoreslogicTest {

    public ScoreslogicTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void ones() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(2);
        d4.setSilmaluku(4);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.ONES) == 1);
    }

    @Test
    public void twos() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(2);
        d4.setSilmaluku(4);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.TWOS) == 2);
    }

    @Test
    public void threes() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(3);
        d4.setSilmaluku(3);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.THREES) == 6);
    }

    @Test
    public void fours() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(4);
        d4.setSilmaluku(4);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.FOURS) == 8);
    }
    
    @Test
    public void fives() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(5);
        d3.setSilmaluku(5);
        d4.setSilmaluku(5);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.FIVES) == 15);
    }
    
    @Test
    public void sixes() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(4);
        d4.setSilmaluku(4);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.SIXES) == 12);
    }
    
    @Test
    public void pair() {
        ArrayList<Die> dice = new ArrayList<>();
        Scoreslogic sl = new Scoreslogic();
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        Die d4 = new Die();
        Die d5 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(1);
        d3.setSilmaluku(3);
        d4.setSilmaluku(4);
        d5.setSilmaluku(6);
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        sl.setDice(dice);
        assertTrue(sl.calcPossibleScores().get(Scores.Hand.ONE_PAIR) == 12);
    }

}
