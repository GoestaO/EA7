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
public class Main {

    public static void main(String[] args) {
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(5);
        AddKnoten add = new AddKnoten(t1, t2);
        SubKnoten sub = new SubKnoten(t1, t2);
//		assertEquals("toString() bei SubKnoten fehlerhaft", "(15 - 5)", sub.toString());
        MultKnoten mult = new MultKnoten(t1, t2);
//		assertEquals("toString() bei MultKnoten fehlerhaft", "(15 * 5)", mult.toString());
        DivKnoten div = new DivKnoten(t1, t2);
//		assertEquals("toString() bei DivKnoten fehlerhaft", "(15 / 5)", div.toString());
        Knoten k = new SubKnoten(new DivKnoten(new AddKnoten(add, sub), div), mult);
//		assertEquals("toString() liefert bei folgendem Ausdruck nicht das gewünschte Ergebnis: ((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", "((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", k.toString());
        k.toString();
    }
}
