/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a74;

/**
 *
 * @author goesta
 */
public abstract class BinaerOperatorKnoten implements Knoten {

    private Knoten erster;

    private Knoten zweiter;

    public BinaerOperatorKnoten(Knoten erster, Knoten zweiter) {
        if (erster == null || zweiter == null) {
            throw new IllegalArgumentException();
        }
        this.erster = erster;
        this.zweiter = zweiter;
    }

    public Knoten liefereErstenOperand() {
        return erster;
    }

    public Knoten liefereZweitenOperand() {
        return zweiter;
    }

}
