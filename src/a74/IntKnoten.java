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
public class IntKnoten implements Knoten {

    private final int wert;

    public IntKnoten(int wert) {
        this.wert = wert;
    }

    @Override
    public int werteAus() {
        return this.wert;
    }

    @Override
    public String toString() {
        return new Integer(werteAus()).toString();
    }
    
   
}
