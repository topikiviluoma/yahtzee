/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.yahtzee;

/**
 *
 * @author topikivi
 */
public class Main {
    
    public static void main(String[] args) {
        Dice n = new Dice();
        n.heita();
        System.out.println(n.getSilmaluku());
        n.heita();
        System.out.println(n.getSilmaluku());
        n.heita();
        System.out.println(n.getSilmaluku());
                
    }
    
}
