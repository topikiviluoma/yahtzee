package yahtzee.logic;

import api.Scores.Hand;
import java.util.Scanner;

/**
 *
 * Run metodin sisältävä käyttöliittymäluokka.
 */
public class Game {

    ScoresLogic sl;
    Round r;
    Scanner lukija;
    int roundNumber;

    public Game() {
        sl = new ScoresLogic();
        r = new Round();
        lukija = new Scanner(System.in);
        r.createDice();
        roundNumber = 1;
    }

    public void run() {
        /**
         * Loopataan yhteensä 15 kierrosta, joka on koko pelin heittokierrosten
         * määrä.
         */
        for (int i = 0; i < 15; i++) {
            /**
             * joka kierroksen alussa tulostetaan kierroksen numero ja saadut
             * tulokset.
             */
            System.out.println("Round: " + roundNumber);
            System.out.println("Scores: ");
            System.out.println(sl.getScores());
            /**
             * Joka kierroksen alussa heitetään kaikki 5 noppaa.
             */
            r.rollDice();
            /**
             * jonka jälkeen pelaaja näkee noppien silmäluvut, sekä mahdolliset
             * tulokset ja saa valita lukittavat nopat.
             *
             */
            for (int k = 0; k < 2; k++) {
                System.out.println("Nopat: ");
                System.out.println(r.getDice());
                System.out.print("Mahdolliset tulokset: ");
                System.out.println(sl.calcPossibleScores(r.getDice()));
                System.out.println("");
                /**
                 * valitaan lukittavat.
                 */
                System.out.println("Valitse lukittavat:");
                String lukittavat = lukija.nextLine();
                if (lukittavat.contains("0")) {
                    r.getDice().get(0).lock();
                }
                if (lukittavat.contains("1")) {
                    r.getDice().get(1).lock();
                }
                if (lukittavat.contains("2")) {
                    r.getDice().get(2).lock();
                }
                if (lukittavat.contains("3")) {
                    r.getDice().get(3).lock();
                }
                if (lukittavat.contains("4")) {
                    r.getDice().get(4).lock();
                }
                /**
                 * pyöräytetään ne nopat, joita ei ole lukittu.
                 */

                r.rollDice();
                /**
                 * lopuksi vapautetaan kaikkien noppien lukitus seuraavaa
                 * kierrosta varten.
                 */
                r.unlockDice();
            }

            /**
             * kun pelaaja on heittänyt kierroksensa, saa hän valita tuloksen,
             * johon syötetään pisteet.
             */
            System.out.println(r.getDice());
            
            System.out.println(sl.calcPossibleScores(r.getDice()));
            while (true) {
                System.out.println("Valitse tulos: ");

                String tulos = lukija.nextLine();
                /**
                 * tulos on kirjoitettava täsmälleen esitetyllä tavalla, eli
                 * isoilla kirjaimilla.
                 */
                try {
                    sl.addScore(Hand.valueOf(tulos), sl.calcPossibleScores(r.getDice()).get(Hand.valueOf(tulos)));
                    roundNumber++;
                    break;
                    /**
                     * muuten ohjelma pyytää yrittämään uudelleen.
                     */
                } catch (Exception e) {
                    System.out.println("Valitse uudelleen");
                }
            }
        }
        System.out.println("Kokonaispisteet: " + sl.getTotal());

    }
}
