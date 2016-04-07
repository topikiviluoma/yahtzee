/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author topikivi
 */
public class AddPlayers implements Runnable {

    private JFrame frame;

    public AddPlayers() {

    }

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JLabel nimiTeksti = new JLabel("Pelaaja 1: ");
        JTextField nimiKentta = new JTextField();
        JLabel hetuTeksti = new JLabel("Pelaaja 2: ");
        JTextField hetuKentta = new JTextField();

        JButton lisaaNappi = new JButton("Lisää pelaajat!");
        // tapahtumankuuntelija

        container.add(nimiTeksti);
        container.add(nimiKentta);
        container.add(hetuTeksti);
        container.add(hetuKentta);
        container.add(new JLabel(""));
        container.add(lisaaNappi);

    }

    public JFrame getFrame() {
        return frame;
    }
}
