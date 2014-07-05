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
public class Baum {

    private Knoten wurzel;

    public Knoten liefereWurzel() {
        return wurzel;
    }

    public Baum(Knoten wurzel) {
        this.wurzel = wurzel;
    }

    public int werteAus() {
        return wurzel.werteAus();
    }

    public String toString() {
        return wurzel.toString();
    }

    // ((m) + (i3 / (s)))
    public static Baum erzeugeBeispielBaum(int a, int b, int c, int d, int e) {
        IntKnoten i1 = new IntKnoten(a);
        IntKnoten i2 = new IntKnoten(b);
        IntKnoten i3 = new IntKnoten(c);
        IntKnoten i4 = new IntKnoten(d);
        IntKnoten i5 = new IntKnoten(e);

        MultKnoten m = new MultKnoten(i1, i2);
        SubKnoten s = new SubKnoten(i4, i5);
        DivKnoten div = new DivKnoten(i3, s);
        AddKnoten add = new AddKnoten(m, div);

        Baum baum = new Baum(add);
        return baum;
    }

}
