package yahtzee.logic;

import java.util.ArrayList;

/**
 *
 * @author topikivi
 */
public class Round {

    private String player;
    private ArrayList<Die> d;

    /**
     * Konstruktori.
     */
    public Round(String p) {
        this.player = p;
        this.d = new ArrayList<>();

    }

    /**
     *
     * luo loopilla nopat ja lisää ArrayListiin.
     */
    public void createDice() {
        for (int i = 0; i < 5; i++) {
            d.add(new Die());
        }

    }

    /**
     *
     * Katsoo jokaisesta nopasta onko se lukittu, jos ei pyöräyttää ja arpoo
     * random luvun.
     */
    public void rollDice() {
        for (Die die : d) {
            if (!die.locked) {
                die.roll();
            }
        }
    }

    public ArrayList<Die> getDice() {
        return d;
    }

    /**
     *
     * tulostaa mahdolliset tulokset.
     */
    public void printScores() {
        ScoresLogic sl = new ScoresLogic();
        System.out.println("Mahdolliset tulokset: ");
        System.out.println(sl.calcPossibleScores(getDice()));
    }

    /**
     *
     * vapauttaa kaikki nopat lukituksesta seuraavaa heittokierrosta varten.
     */
    public void unlockDice() {
        for (Die die : d) {
            die.unlock();
        }
    }
}
