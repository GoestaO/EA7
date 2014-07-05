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
public class DivKnoten extends BinaerOperatorKnoten {

    @Override
    public int werteAus() {
        if (liefereZweitenOperand().werteAus() == 0) {
            throw new ArithmeticException("Division durch 0!");
        }
        return liefereErstenOperand().werteAus() / liefereZweitenOperand().werteAus();
    }

    public DivKnoten(Knoten erster, Knoten zweiter) {
        super(erster, zweiter);
    }

    @Override
    public String toString() {
        return "(" + liefereErstenOperand().werteAus() + " / " + liefereZweitenOperand().werteAus() + ")";
    }

}
