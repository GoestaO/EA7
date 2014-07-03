/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author goesta
 */
public class DateiSortierer {

    public StringListe einlesen(String dateiname) throws FileNotFoundException {
        StringListe liste = new StringListe();

        if (dateiname != null) {
            Scanner sc = new Scanner(new File(dateiname));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                liste.add(line);
            }
        } else {
            throw new DateiNichtGefundenAusnahme(dateiname);
        }
        return liste;
    }

    public StringListe sortiere(StringListe unsortierteListe) {
        if (unsortierteListe == null) {
            throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
        }
        Collections.sort(unsortierteListe);
        StringListe sortierteListe = unsortierteListe;
        unsortierteListe.clear();
        return sortierteListe;
    }
    
//    public void gebeAus(OutputStream out, StringListe zeilen){
//        for (String zeile:zeilen){
//            out.
//        }
//    }
}
