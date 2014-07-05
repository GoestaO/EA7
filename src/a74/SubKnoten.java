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
public class SubKnoten extends BinaerOperatorKnoten {

    @Override
    public int werteAus() {
        return liefereErstenOperand().werteAus() - liefereZweitenOperand().werteAus();
    }

    public SubKnoten(Knoten erster, Knoten zweiter) {
        super(erster, zweiter);
    }

    @Override
    public String toString() {
        return "(" + liefereErstenOperand().werteAus() + " - " + liefereZweitenOperand().werteAus() + ")";
    }

}
