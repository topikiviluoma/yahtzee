/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author topikivi
 */
public class RoundTest {
    Round r;
    public RoundTest() {
        r = new Round();
    }
    
    
   @Test
   public void createsRightAmountOfDice() {
       
       r.createDice();
       assertEquals(5, r.getDice().size());
   }
   
   @Test
   public void unlockDiceWorks() {
       r.createDice();
       r.getDice().get(0).lock();
       r.unlockDice();
       assertEquals(r.getDice().get(0).locked, false);
   }
   
   @Test
   public void lockDiceWorks() {
       r.createDice();
       r.getDice().get(0).lock();
       assertEquals(r.getDice().get(0).locked, true);
   }
}
