/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.logic;

import java.util.List;

/**
 *
 * @author topikivi
 */
public class Player {

    private String nimi;

    public Player(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public String toString() {
        return this.nimi;
    }

}
