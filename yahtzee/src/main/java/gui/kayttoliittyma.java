/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import yahtzee.logic.Die;

/**
 *
 * Käyttöliittymämallin testaus!!
 */
public class kayttoliittyma extends javax.swing.JFrame {

    /**
     * Creates new form kayttoliittyma
     */
    public kayttoliittyma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ROLL = new javax.swing.JButton();
        die1 = new javax.swing.JLabel();
        die2 = new javax.swing.JLabel();
        die3 = new javax.swing.JLabel();
        die4 = new javax.swing.JLabel();
        die5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ONES", null},
                {"TWOS", ""},
                {"THREES", null},
                {"FOURS", null},
                {"FIVES", null},
                {"SIXES", null},
                {"Upper Score", null},
                {"Upped Bonus", null},
                {"TWO_PAIRS", null},
                {"THREE OF A KIND", null},
                {"FOUR_OF_A_KIND", null},
                {"FULL HOUSE", null},
                {"SMALL STRAIGHT", null},
                {"LARGE STRAIGHT", null},
                {"YAHTZEE", null},
                {"CHANCE", null},
                {"Lower Score", null},
                {"TOTAL", null}
            },
            new String [] {
                "Category", "Player1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        ROLL.setText("ROLL");
        ROLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROLLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ROLL, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(die3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(die4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(die5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(die1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(die2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {die1, die2, die3, die4, die5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(ROLL)
                .addGap(18, 18, 18)
                .addComponent(die1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(die2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(die3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(die4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(die5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {die1, die2, die3, die4, die5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ROLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROLLActionPerformed
        // TODO add your handling code here:
        rollDie1();
        rollDie2();
        rollDie3();
        rollDie4();
        rollDie5();
    }//GEN-LAST:event_ROLLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kayttoliittyma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayttoliittyma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayttoliittyma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayttoliittyma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayttoliittyma().setVisible(true);
            }
        });
    }
    public void rollDie1() {
        Die d = new Die();
        d.roll();
        switch (d.getFaceValue()) {
            case 1:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_1.png"));
                break;
            case 2:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_2.png"));
                break;
            case 3:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_3.png"));
                break;
            case 4:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_4.png"));
                break;
            case 5:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_5.png"));
                break;
            case 6:
                die1.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_6.png"));
                break;
        }

    }

    public void rollDie2() {
        Die d = new Die();
        d.roll();
        switch (d.getFaceValue()) {
            case 1:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_1.png"));
                break;
            case 2:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_2.png"));
                break;
            case 3:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_3.png"));
                break;
            case 4:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_4.png"));
                break;
            case 5:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_5.png"));
                break;
            case 6:
                die2.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_6.png"));
                break;
        }
    }

    public void rollDie3() {
        Die d = new Die();
        d.roll();
        switch (d.getFaceValue()) {
            case 1:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_1.png"));
                break;
            case 2:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_2.png"));
                break;
            case 3:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_3.png"));
                break;
            case 4:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_4.png"));
                break;
            case 5:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_5.png"));
                break;
            case 6:
                die3.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_6.png"));
                break;
        }
    }

    public void rollDie4() {
        Die d = new Die();
        d.roll();
        switch (d.getFaceValue()) {
            case 1:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_1.png"));
                break;
            case 2:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_2.png"));
                break;
            case 3:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_3.png"));
                break;
            case 4:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_4.png"));
                break;
            case 5:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_5.png"));
                break;
            case 6:
                die4.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_6.png"));
                break;
        }
    }
    public void rollDie5() {
        Die d = new Die();
        d.roll();
        switch(d.getFaceValue()) {
        case 1:
               die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_1.png")); 
                break;
            case 2:
                die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_2.png")); 
                break;
            case 3:
                die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_3.png")); 
                break;
            case 4:
                die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_4.png")); 
                break;
            case 5:
               die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_5.png")); 
                break;
            case 6:
               die5.setIcon(new ImageIcon("/home/topikivi/NetBeansProjects/yahtzee/yahtzee/src/main/java/gui/dieImages/die_6.png")); 
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ROLL;
    private javax.swing.JLabel die1;
    private javax.swing.JLabel die2;
    private javax.swing.JLabel die3;
    private javax.swing.JLabel die4;
    private javax.swing.JLabel die5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
