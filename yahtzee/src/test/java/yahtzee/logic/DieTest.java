package yahtzee.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yahtzee.logic.Die;

/**
 *
 * @author topikivi
 */
public class DieTest {

    public DieTest() {
    }

   
    @Test
    public void konstruktoriAntaaSilmaluvuksi1() {
        Die d = new Die();

        assertEquals(1, d.getFaceValue());
    }
    
    @Test
    public void lockingDiceWorks() {
        Die d = new Die();
        d.lock();
        assertEquals(true, d.locked());
    }
    
    @Test
    public void unlockingDiceWorks() {
        Die d = new Die();
        d.lock();
        d.unlock();
        assertEquals(false, d.locked());
    }
    
}
