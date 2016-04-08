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
    
    public RoundTest() {
    }
    
    
   @Test
   public void createsRightAmountOfDice() {
       Round r = new Round("Pekka");
       r.createDice();
       assertEquals(5, r.getDice().size());
   }
}
