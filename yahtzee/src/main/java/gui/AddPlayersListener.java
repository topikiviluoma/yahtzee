/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import yahtzee.logic.Player;

/**
 *
 * @author topikivi
 */
public class AddPlayersListener implements ActionListener {
    
    
    private JTextField p1;
    private JTextField p2;
    
    public AddPlayersListener(JTextField nameField1, JTextField nameField2) {
        this.p1 = nameField1;
        this.p2 = nameField2;
       
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        Player player1 = new Player(p1.getText());
        Player player2 = new Player(p2.getText());
    }
    
   
}
