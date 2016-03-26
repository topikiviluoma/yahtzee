/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.Scanner;

/**
 *
 * @author topikivi
 */
public class Main {

    public static void main(String[] args) {
        //rundin testausta
        Scanner lukija = new Scanner(System.in);
        Player p = new Player("Pekka");
        Round r = new Round(p);
        r.luoNopat();
        r.rollDice();
        for (int i = 1; i < 6; i++) {
            System.out.println("Noppa" + i + ": " + r.getDice().get(i - 1));
        }

        System.out.println("Valitse pyöräytettävät: ");
        int[] valitut = new int[5];
        int j = 0;
        while (!lukija.nextLine().isEmpty()) {

            valitut[j] = Integer.parseInt(lukija.nextLine());;
            j++;
        }
        r.rollDice(valitut);

        for (int i = 1; i < 6; i++) {
            System.out.println("Noppa" + i + ": " + r.getDice().get(i - 1));
        }

    }

}
