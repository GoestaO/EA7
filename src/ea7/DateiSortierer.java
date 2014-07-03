/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author goesta
 */
public class DateiSortierer {

    /**
     * Diese Methode soll den Inhalt der gegebenen Datei einlesen und eine Liste
     * der einzelnen Zeilen zurückliefern.
     *
     * @param dateiname
     * @return
     * @throws IOException
     * @throws DateiNichtGefundenAusnahme
     */
    public StringListe einlesen(String dateiname) throws IOException, DateiNichtGefundenAusnahme {
        StringListe liste = new StringListe();
        File f = new File(dateiname);
        if (!f.isFile() && !f.canRead()) {
            throw new DateiNichtGefundenAusnahme(dateiname);
        }

        Scanner sc = new Scanner(new File(dateiname));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            liste.add(line);
        }
        return liste;
    }

    /**
     * Diese Methode soll die gegebene Liste lexikographisch aufsteigend
     * sortieren und die sortierte Liste zurückliefern.
     *
     * @param unsortierteListe
     * @return
     */
    public StringListe sortiere(StringListe unsortierteListe) {
        if (unsortierteListe == null) {
            throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
        }
        Collections.sort(unsortierteListe);
        StringListe sortierteListe = unsortierteListe;
        return sortierteListe;
    }

    /**
     * Die Methode soll die in der Liste zeilen übergebenen Zeichenketten auf
     * dem Ausgabestrom out zeilenweise ausgeben.
     *
     * @param out
     * @param zeilen
     */
    public void gebeAus(OutputStream out, StringListe zeilen) {

        try {
            try {
                for (String zeile : zeilen) {
                    for (int i = 0; i < zeile.length(); i++) {
                        out.write(zeile.charAt(i));
                    }
                    out.write('\n');
                }
            } finally {
                out.close();
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Diese Methode soll den Inhalt der übergebenen Datei einlesen, sortieren
     * und anschließend auf der Standardausgabe wieder ausgeben.
     *
     * @param dateiname
     */
    public void sortiereDatei(String dateiname) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            StringListe l = this.einlesen(dateiname);
            StringListe sorted = this.sortiere(l);
            this.gebeAus(baos, sorted);
            System.out.print(baos);
        } catch (DateiNichtGefundenAusnahme ausn) {
            System.err.println("Die Datei " + ausn.liefereDateinamen() + " konnte nicht gefunden werden.");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
