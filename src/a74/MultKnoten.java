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
public class MultKnoten extends BinaerOperatorKnoten {

    @Override
    public int werteAus() {
        return liefereErstenOperand().werteAus() * liefereZweitenOperand().werteAus();
    }

    public MultKnoten(Knoten erster, Knoten zweiter) {
        super(erster, zweiter);
    }

}