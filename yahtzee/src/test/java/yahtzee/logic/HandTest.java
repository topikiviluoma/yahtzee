package yahtzee.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yahtzee.logic.Die;
import yahtzee.logic.Hand;

/**
 *
 * @author topikivi
 */
public class HandTest {
    
    public HandTest() {
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
    public void laskeeSummanOikein() {
        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();
        d1.setSilmaluku(6);
        d2.setSilmaluku(6);
        d3.setSilmaluku(6);
        ArrayList<Die> dc = new ArrayList<>();
        dc.add(d1);
        dc.add(d2);
        dc.add(d3);
        Hand h = new Hand(dc);
        
        assertEquals(18, h.laskeSumma());
       
       
    }
}
