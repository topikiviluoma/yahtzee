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
import api.Scores;


/**
 *
 * @author topikivi
 */
public class ScoreslogicTest {
    ArrayList<Die> dice;
    ScoresLogic score;

    public ScoreslogicTest() {
        this.dice = new ArrayList<>();
        this.score = new ScoresLogic();
        
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
    
    }

   
    @Test
    public void ones() {
        
        dice.get(0).setFaceValue(1);
        dice.get(1).setFaceValue(1);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(2, score.calcPossibleScores(dice).get(Scores.Hand.ONES).intValue());
    }

    @Test
    public void twos() {
     
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(2);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(4, score.calcPossibleScores(dice).get(Scores.Hand.TWOS).intValue());
    }

    @Test
    public void threes() {
       
        dice.get(0).setFaceValue(3);
        dice.get(1).setFaceValue(3);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(9, score.calcPossibleScores(dice).get(Scores.Hand.THREES).intValue());
    }

    @Test
    public void fours() {
      
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(4);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.FOURS).intValue());
    }
    
    @Test
    public void fives() {
      
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(5);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(10, score.calcPossibleScores(dice).get(Scores.Hand.FIVES).intValue());
    }
    
    @Test
    public void sixes() {
      
        dice.get(0).setFaceValue(6);
        dice.get(1).setFaceValue(1);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.SIXES).intValue());
    }
    
    @Test
    public void pair() {
       
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.ONE_PAIR).intValue());
    }
    
    @Test
    public void twoPair() {
    
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(20, score.calcPossibleScores(dice).get(Scores.Hand.TWO_PAIRS).intValue());
    }
    
    @Test
    public void threeOfAKind() {
       
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(4);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(12, score.calcPossibleScores(dice).get(Scores.Hand.THREE_OF_A_KIND).intValue());
    }
    
    @Test
    public void fourOfAKind() {
      
        dice.get(0).setFaceValue(6);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(6);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(24, score.calcPossibleScores(dice).get(Scores.Hand.FOUR_OF_A_KIND).intValue());
    }
    
    @Test
    public void fullHouse() {
      
        dice.get(0).setFaceValue(4);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(6);
        
        
        assertEquals(26, score.calcPossibleScores(dice).get(Scores.Hand.FULL_HOUSE).intValue());
    }
    
    @Test
    public void smallStraight() {
      
        dice.get(0).setFaceValue(1);
        dice.get(1).setFaceValue(2);
        dice.get(2).setFaceValue(3);
        dice.get(3).setFaceValue(4);
        dice.get(4).setFaceValue(5);
        
        
        assertEquals(15, score.calcPossibleScores(dice).get(Scores.Hand.SMALL_STRAIGHT).intValue());
    }
    
    @Test
    public void largeStraight() {
       
        dice.get(0).setFaceValue(2);
        dice.get(1).setFaceValue(3);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(5);
        dice.get(4).setFaceValue(6);
        
        
        assertEquals(20, score.calcPossibleScores(dice).get(Scores.Hand.LARGE_STRAIGHT).intValue());
    }
    
    @Test 
    public void yahtzee() {
      
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(5);
        dice.get(2).setFaceValue(5);
        dice.get(3).setFaceValue(5);
        dice.get(4).setFaceValue(5);
        
        
        assertEquals(50, score.calcPossibleScores(dice).get(Scores.Hand.YATZY).intValue());
    
        
    }
    
    @Test
    public void chance() {
       
        dice.get(0).setFaceValue(5);
        dice.get(1).setFaceValue(6);
        dice.get(2).setFaceValue(4);
        dice.get(3).setFaceValue(6);
        dice.get(4).setFaceValue(3);
        
        
        assertEquals(24, score.calcPossibleScores(dice).get(Scores.Hand.CHANCE).intValue());
    }

}
