package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author topikivi
 */
public class Ui implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Yatzy");
        frame.setPreferredSize(new Dimension(700, 700));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container contentPane) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        ;
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

}
