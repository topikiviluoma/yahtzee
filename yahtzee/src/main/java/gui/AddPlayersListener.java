/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import yahtzee.logic.Player;

/**
 *
 * @author topikivi
 */
public class AddPlayersListener implements ActionListener {
    
    public String player1;
    public String player2;
    private JTextField p1;
    private JTextField p2;
    public ArrayList<String> players;
    
    public AddPlayersListener(JTextField nameField1, JTextField nameField2) {
        this.players = new ArrayList<>();
        this.p1 = nameField1;
        this.p2 = nameField2;
       
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        player1 = p2.getText();
        player2 = p2.getText();
    }
    
    public ArrayList<String> getPlayers() {
        return this.players;
    }
    
   
}
