package yahtzee.logic;

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
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(1);
        dice.get(1).setFaceValue(1);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(2, score.calcPossibleScores(dice).get(Scores.Hand.ONES).intValue());
    }

    @Test
    public void twos() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(2);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(4, score.calcPossibleScores(dice).get(Scores.Hand.TWOS).intValue());
    }

    @Test
    public void threes() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(3);
        dice.get(1).setFaceValue(3);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(9, score.calcPossibleScores(dice).get(Scores.Hand.THREES).intValue());
    }

    @Test
    public void fours() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(4);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.FOURS).intValue());
    }
    
    @Test
    public void fives() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(5);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(10, score.calcPossibleScores(dice).get(Scores.Hand.FIVES).intValue());
    }
    
    @Test
    public void sixes() {
       ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(6);
        dice.get(1).setFaceValue(1);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.SIXES).intValue());
    }
    
    @Test
    public void pair() {
       ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.ONE_PAIR).intValue());
    }
    
    @Test
    public void twoPair() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(20, score.calcPossibleScores(dice).get(Scores.Hand.TWO_PAIRS).intValue());
    }
    
    @Test
    public void threeOfAKind() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(4);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.THREE_OF_A_KIND).intValue());
    }
    
    @Test
    public void fourOfAKind() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(6);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(6);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(24, score.calcPossibleScores(dice).get(Scores.Hand.FOUR_OF_A_KIND).intValue());
    }
    
    @Test
    public void fullHouse() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(6);
        
        
        assertEquals(26, score.calcPossibleScores(dice).get(Scores.Hand.FULL_HOUSE).intValue());
    }
    
    @Test
    public void smallStraight() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(1);
        dice.get(1).setFaceValue(2);
        dice.get(2).setFaceValue(3);
        dice.get(3).setFaceValue(4);
        dice.get(4).setFaceValue(5);
        
        
        assertEquals(15, score.calcPossibleScores(dice).get(Scores.Hand.SMALL_STRAIGHT).intValue());
    }
    
    @Test
    public void largeStraight() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(3);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(5);
        dice.get(4).setFaceValue(6);
        
        
        assertEquals(20, score.calcPossibleScores(dice).get(Scores.Hand.LARGE_STRAIGHT).intValue());
    }
    
    @Test 
    public void yahtzee() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(5);
        dice.get(2).setFaceValue(5);
        dice.get(3).setFaceValue(5);
        dice.get(4).setFaceValue(5);
        
        
        assertEquals(50, score.calcPossibleScores(dice).get(Scores.Hand.YATZY).intValue());
    
        
    }
    
    @Test
    public void chance() {
        ArrayList<Die> dice = new ArrayList<>();
        ScoresLogic score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(24, score.calcPossibleScores(dice).get(Scores.Hand.CHANCE).intValue());
    }

}
